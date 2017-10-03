/**
 * 
 */
package com.cs490;

/**
 * @author Nathan
 *
 */
public class JSONCustomerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingredient i = new Ingredient(12, "orange", "fruit");
		System.out.println("Java object: " + i.toString());

		// Create the new Gson object to do the marshalling
		Gson theGsonObj = new GsonBuilder().create();

		// Use theGsonObj to create the JSON formatted String for the Ingredient
		// object
		String jsonIngredient = theGsonObj.toJson(i);
		// Print the JSON formatted object
		System.out.println("JSON formatted: " + jsonIngredient);

		// Convert the JSON string back into an Ingredient object
		// (unmarshalling)
		Ingredient i2 = theGsonObj.fromJson(jsonIngredient, Ingredient.class);

		// Print the newly inflated Ingredient Object
		System.out.println("Back to Java object: " + i2.toString());
	}

}
