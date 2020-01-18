package java8project;

public class Human {
int age;
int heightInches;
String name;
String eyeColor;


public Human(int age, int heightInches, String name, String eyeColor) {
	super();
	this.age = age;
	this.heightInches = heightInches;
	this.name = name;
	this.eyeColor = eyeColor;
}
public void speak()
{
	System.out.println(" hello my name is" + name);
	System.out.println("I am"+heightInches+"inches tall");
	System.out.println("I am "+age +"years old");
	System.out.println("my eye color is" +eyeColor);
	
}
public void eat()
{
	System.out.println("eating");
}
public void walk()  
{
	System.out.println("walking");
	
}
public void work()
{
	System.out.println("working");

	}

}
