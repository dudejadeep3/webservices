package com.tutorial.webservice.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tutorial.webservice.messenger.model.Comment;
import com.tutorial.webservice.messenger.service.CommentService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {

	private CommentService commentService = new CommentService();

	@GET
	public List<Comment> getComments(@PathParam("messageId") long messageId) {
		return commentService.getAllComments(messageId);
	}

	@GET
	@Path("/{commentId}")
	public Comment getComment(@PathParam("commentId") long commentId, @PathParam("messageId") long messageId) {
		return commentService.getComment(messageId, commentId);
	}

	@POST
	public Comment addComment(@PathParam("messageId") long messageId, Comment comment) {
		return commentService.addComment(messageId, comment);
	}

	@PUT
	@Path("/{commentId}")
	public Comment updateComment(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId,
			Comment comment) {
		comment.setId(commentId);
		return commentService.updateComment(messageId, comment);
	}

	@DELETE
	@Path("/{commentId}")
	public Comment removeComment(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId) {
		return commentService.removeComment(messageId, commentId);
	}
}
