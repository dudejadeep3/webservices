package com.tutorial.webservice.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

	@GET
	@Path("/annotations")
	public String getParamUsingAnnotations(@MatrixParam("param") String matrixParam,
			@HeaderParam("customHeaderParam") String customHeaderValue, @CookieParam("name") String name) {
		return "Matrix Param:" + matrixParam + "Header Param:" + customHeaderValue + " cookie:" +name;
	}
}
