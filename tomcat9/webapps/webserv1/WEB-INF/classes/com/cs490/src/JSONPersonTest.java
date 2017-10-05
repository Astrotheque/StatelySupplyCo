package com.cs490;
import com.google.gson.Gson;

public class JSONPersonTest{

	public static void main(String[] args}{
		
		Person p = new Person(12, "orange", "fruit");
		System.out.println("Java object: "+p.toString());
		
		//Create the new Gson object to do the marshalling
		Gson theGsonObj = new GsonBuilder().create();
		
		//Use theGsonObj to create the JSON formatted String for the Person object
		String jsonPerson = the GsonObj.toJson(p);
		//Print the JSON formatted object
		System.out.println("JSON formatted: "+ jsonPerson);
		
		//Convert the JSON string back into an Person object (unmarshalling)
		Person p2 = theGsonObj.fromJson(jsonPerson, Person.class);
		
		//Print the newly inflated Person Object
		System.out.println("Back to Java object: "+ p2.toString());
	}
}