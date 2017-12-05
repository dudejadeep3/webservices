package com.tutorial.webservice.messenger.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.tutorial.webservice.messenger.model.Message;
import com.tutorial.webservice.messenger.resources.bean.MessageFilterBean;
import com.tutorial.webservice.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	private MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@BeanParam MessageFilterBean messageFilter) {
		if(messageFilter.getYear()>0){
			return messageService.getAllMessgesForYear(messageFilter.getYear());
		}
		if(messageFilter.getStart()>=0 && messageFilter.getSize()>0){
			return messageService.getAllMessagesPaginated(messageFilter.getStart(), messageFilter.getSize());
		}
		return messageService.getAllMessages();
	}

	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Message getMessageFromId(@PathParam("messageId") long messageId) {
		return messageService.getMessage(messageId);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addMessage(Message message, @Context UriInfo uriInfo) throws URISyntaxException {
		//return messageService.addMessage(message);
		Message newMessage = messageService.addMessage(message);
		//return Response.status(Status.CREATED).entity(newMessage).build();
		
		String newId = String.valueOf(newMessage.getId());
		URI uri =uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(newMessage).build();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message udpateMessage(Message message, @PathParam("messageId") long messageId){
		message.setId(messageId);
		return messageService.updateMessage(message);
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message removeMessage(@PathParam("messageId") long id){
		return messageService.removeMessage(id);
	}
	
	/**
	 *  
	 * @return the comment resource as it is a sub resource for message.
	 */
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource(){
		return new CommentResource();
	}
}
