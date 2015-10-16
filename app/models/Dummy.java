package models;

public class Dummy{
	String name;

	public Dummy(){
		System.out.println("Inside Dummy controller");
		name = "ikbhal";
	}

	public String getName(){return name;}
	public void setName(String name){this.name = name;}

	public String toString(){return name;}
}