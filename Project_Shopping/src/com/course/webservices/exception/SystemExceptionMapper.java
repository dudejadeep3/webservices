package com.course.webservices.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.course.webservices.model.ErrorMessage;

@Provider
public class SystemExceptionMapper implements ExceptionMapper<SystemException>{

	@Override
	public Response toResponse(SystemException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "https://www.google.co.in");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}

}
