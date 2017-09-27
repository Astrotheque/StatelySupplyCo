package com.cs330;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("ws2")
public class IngredientServices {
	@Path("/ingredients")
	@GET
	@Produces("text/plain")
	public String getIngredients() {
		return "apples,pears,meat,noodles";
	}//end getIngredients
	//The optional id indicates a path parameter ( a parameter
	// passed directly in the URL path
	// @PathParam("id") means that the value in the url that
	// occupies the spot where /{id} is, will be passed
	// through theId parameter to the method
	@Path("/ingredients/{id}")
	@GET
	@Produces("text/plain")
	public String getIngredientById(@PathParam("id") String theId) {
		int intId = 0;
		String theIng = "";
		//Since url parameters are always strings, convert to int
		try {
			
			intId = Integer.parseInt(theId);
		}catch (NumberFormatException ne) {
			intId = 1;
		}
		//retrieve ingredient from database
		if(intId == 2) {
			theIng = "2. apple: FRUIT";
		}
		else {theIng="Some other ingredient";}
		return theIng;
	}//end getIngredientById
	//The @QueryParam("name") looks for a section of the url
	// after the ? that reads name=something. The string
	// in the url that occupies the 'something' spot will be
	// passed through the theName parameter into the method
	@Path("/ingredients/ingredient")
	@GET
	@Produces("text/plain")
	public String getIngredientByName(@QueryParam("name") String theName) {
		String theIng="";
		//retrieve ingredient from database
		if(theName.equals("apple") ) {
			theIng = "2. apple: FRUIT";
		}
		else {
			theIng="Some other ingredient";
		}
		return theIng;
	}//end getIngredientByName
}//end class