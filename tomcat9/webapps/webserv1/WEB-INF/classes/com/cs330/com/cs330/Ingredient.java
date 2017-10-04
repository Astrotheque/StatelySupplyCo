package com.cs330;
/**
*@class 	Public Class Ingredient
*@author	Nathaniel Griffin
*@date		Sept. 18, 2016
*@ver 		1.0
*/
public class Ingredient{
//etc...per lab 11 instruction
	// Ingredient Instance Variables
	private int id;
	private String name;
	private String category;
	/**
	*Ingredient Default Constructor
	*/
	public Ingredient(){
		this.id = 0;
		this.category="No Category Yet";
		this.name="No Name Yet";	
	}
	/**
	*Ingredient Constructors
	*/
	public Ingredient(String name, String category){
		this.id=0;
		this.name=name;
		this.category=category;
	}
	public Ingredient(int anId, String aName, String aCategory){
		id=anId;
		name=aName;
		category=aCategory;
	}
	/**setId Method : Sets the value of the instance variable id
	 * @param id
	 * @return no return value
	 */
	public void setId(int id){
		this.id=id;
	}
	/**setName Method : Sets the value of the instance variable name
	 * @param name
	 * @return no return value
	 */
	public void setName(String name){
		this.name=name;
	}
	/**setCategory Method : Sets the value of the instance variable name
	 * @param category
	 * @return no return value
	 */
	public void setCategory(String category){
		this.category=category;
	}
	/**getId Method
	 * @param no parameter
	 * @return id of the instance object
	 */
	public int getId(){
		return id;
	}
	/**getName Method
	 * @param no parameter
	 * @return name of the instance object
	 */
	public String getName(){
		return name;
	}
	/**getCategory Method
	 * @param no parameter
	 * @return category of the instance object
	 */
	public String getCategory(){
		return category;
	}
	/**String to String Method
	 * @param no parameter
	 * @return text : string with the information from id, name, and category in a
	 *  specific format.
	 */
	public String toString(){
		String text="";
		text+=this.id+": "+this.name+" ("+this.category+"), ";
		return text;
	}
}