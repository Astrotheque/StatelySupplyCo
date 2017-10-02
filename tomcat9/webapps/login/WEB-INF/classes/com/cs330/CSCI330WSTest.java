package com.cs330;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("ws1")
public class CSCI330WSTest {
	@Path("/test1")
	@GET
	@Produces("text/plain")
	public String getMessage1() {
		return "My first web service in CSCI 330 is working! -- Good job Nathan Griffin!";
	}
	@Path("/test2")
	@GET
	@Produces("text/plain")
	public String getMessage2() {
		return "Welcome to software engineering!";
	}
}//end class