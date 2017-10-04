/**
 * 
 */
package com.cs490;

import javax.ws.rs.GET;

/**
 * @author Nathan
 *
 */
@Path("ws1")
public class CSCI490WSTest {
	@Path("/test1")
	@GET
	@Produces("text/plain")
	public String getMessage1() {
		return "My first web service in CSCI 490 is working! -- Good job Nathan Griffin!";
	}

	@Path("/test2")
	@GET
	@Produces("text/plain")
	public String getMessage2() {
		return "Welcome to software engineering!";
	}
}
