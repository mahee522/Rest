package com.query;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/user")
public class UserService {
	
	//appl/user/query?from=100&to=200&orderBy=age&orderBy=name”
	@GET
	@Path("/query")
	public Response getUsers(@Context UriInfo info) {

		String from = info.getQueryParameters().getFirst("from");
		String to = info.getQueryParameters().getFirst("to");
		List<String> orderBy = info.getQueryParameters().get("orderBy");
		
		return Response.status(200).entity("getUsers is called, from : " + from + ", to : " + to+ ", orderBy" + orderBy.toString()).build();

	}
	//users/query?from=100&to=200&orderBy=age&orderBy=name
	@GET
	@Path("/query1")
	public Response getUsers1(@Context UriInfo info) {

		String from = info.getQueryParameters().getFirst("from");
		String to = info.getQueryParameters().getFirst("to");
		List<String> orderBy = info.getQueryParameters().get("orderBy");
		
		return Response
		   .status(200)
		   .entity("getUsers is called, from : " + from + ", to : " + to
			+ ", orderBy" + orderBy.toString()).build();

	}
	

}