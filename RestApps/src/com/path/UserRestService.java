package com.path;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserRestService {

	
	//=====================PATHPPARAM===============
	//http://localhost:9999/RestApps/app/users
	@GET
	public Response getUser() {

		return Response.status(200).entity("getUser is called").build();

	}

	//http://localhost:9999/RestApps/app/users/vip
	@GET
	@Path("/vip")
	public Response getUserVIP() {

		return Response.status(200).entity("getUserVIP is called").build();

	}
	
	
	//http://localhost:9999/RestApps/app/users/mahi
	@GET
	@Path("{name}")
	public Response getUserByName(@PathParam("name") String name) {

		return Response.status(200)
			.entity("getUserByName is called, name : " + name).build();

	}
	
	//http://localhost:9999/RestApps/app/users/999
	@GET
	@Path("{id : \\d+}") //support digit only
	public Response getUserById(@PathParam("id") String id) {

	   return Response.status(200).entity("getUserById is called, id : " + id).build();

	}

	//http://localhost:9999/RestApps/app/users/username/m9
	@GET
	@Path("/username/{username : [a-zA-Z][a-zA-Z_0-9]}")
	public Response getUserByUserName(@PathParam("username") String username) {

	   return Response.status(200)
		.entity("getUserByUserName is called, username : " + username).build();

	}
	
	
	//http://localhost:9999/RestApps/app/users/books/900
	@GET
	@Path("/books/{isbn : \\d+}")
	public Response getUserBookByISBN(@PathParam("isbn") String isbn) {

	   return Response.status(200)
		.entity("getUserBookByISBN is called, isbn : " + isbn).build();

	}
	
	//http://localhost:9999/RestApps/app/users/2015/09/30
	@GET
	@Path("{year}/{month}/{day}")
	public Response getUserHistory(
			@PathParam("year") int year,
			@PathParam("month") int month, 
			@PathParam("day") int day) {

	   String date = year + "/" + month + "/" + day;

	   return Response.status(200)
		.entity("getUserHistory is called, year/month/day : " + date)
		.build();

	}

	
	
	
	
	
	
	
	
}