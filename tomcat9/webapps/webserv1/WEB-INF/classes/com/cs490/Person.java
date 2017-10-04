/**
 * 
 */
package com.cs490;

/**
 * @author Nathan
 * @version
 * @date
 * 
 */
public class Person {

	/**
	 * Person Instance Variables
	 */
	private int id;
	private String category;
	private String fName;
	private String miName;
	private String lName;
	private int sNumber;
	private String sName;
	private String city;
	private String state;
	private String zip;
	
	/**
	 * Person Default Constructor
	 */
	public Person(){
		this.id=0;
		this.category="No Category Yet";
		this.fName="No  First Name Yet";
		this.mInit="No Middle Initial Yet";
		this.lName="No Last Name Yet";
		this.sNumber=0;
		this.sName="No Street Yet";
		this.city="No City Yet"
		this.state="No State Yet";
		this.zip="No Zip Yet";
	}
	public Person(int id, String fName, String mInit, String lName){
		this.id=id;
		this.fName=fName;
		this.mInit=mInit;
		this.lName=lName;
	}
}
