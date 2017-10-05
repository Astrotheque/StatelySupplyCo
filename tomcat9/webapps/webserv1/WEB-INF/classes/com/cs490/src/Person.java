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
	private String sNumber;
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
		this.sNumber="No Number Yet";
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
	public Person(int id, String fName, String mInit, String lName, String sNumber, String sName, String city, String state, String zip){
		this.id=id;
		this.fName=fName;
		this.mInit=mInit;
		this.lName=lName;
		this.sNumber=sNumber;
		this.sName=sName;
		this.city=city;
		this.state=state;
		this.zip=zip;
	}
	/**
	 * Set Methods
	 * @param id, name, category
	 */
	public void setId(int id){
		this.id=id;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public void setFname(String fName){
		this.fName=fName;
	}
	public void setMinit(String mInit){
		this.mInit=mInit;
	}
	public void setLname(String lName){
		this.lName=lName;
	}
	public void setSnumber(Sting sNumber){
		this.sNumber=sNumber;
	}
	public void setSname(String sName){
		this.sName=sName;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setState(String state){
		this.state=state;
	}
	public void setZip(String zip){
		this.zip=zip;
	}
	/**
	 * Get Methods
	 */
	public int setId(){
		this.id=id;
	}
	public String setCategory(){
		return category;
	}
	public String setFname(){
		return fName;
	}
	public String setMinit(){
		return mInit;
	}
	public String setLname(){
		return lName;
	}
	public String setSnumber(){
		return sNumber;
	}
	public String setSname(){
		return sName;
	}
	public String setCity(){
		return city;
	}
	public String setState(){
		return state;
	}
	public String setZip(){
		return zip;
	}
	/**
	 * String to String Method
	 * @return a string with the information from id, name, and category in a
	 *  specific format.
	 */
	public String toString(){
		String text="";
		text+=this.id+": "+this.fName+" "+this.mInit+" "+this.lName+" ("+this.category+"), ";
		return text;
	}
	public String infoToString(){
		String text="";
		text+=this.id+":  "+this.fName+" "+this.mInit+" "+this.lName+" ("+this.category+")"+System.lineSeparator()
				+this.sNumber+" "+this.sName+System.lineSeparator()
				+this.city+", "+this.state+" "+this.zip+System.lineSeparator();
		return text;
	}
}
