package com.tutorial.webservice.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tutorial.webservice.messenger.model.Message;
import com.tutorial.webservice.messenger.service.MessageService;

@Path("messages")
public class MessageResource {

	private MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	
}
