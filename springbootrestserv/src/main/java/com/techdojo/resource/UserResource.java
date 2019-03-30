package com.techdojo.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/users")
@Produces({ "application/json" })
@Consumes({ "application/json" })
public interface UserResource {
	@GET
	@Path("/user/{user_id}")
	@Produces({ "application/json" })
	@Consumes({ "application/json" })
	public Response getUserWithId(@PathParam("user_id") int userId);
	
	@GET
	@Produces({ "application/json" })
	@Consumes({ "application/json" })
	public Response getUserList();

}
