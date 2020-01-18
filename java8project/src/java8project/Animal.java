package java8project;

public abstract class Animal
{

	
	int	age;
	String gender;
	int weight;
	public Animal(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	public void Eat()
	{
		System.out.println("Eating");
		
	}
	
	public void sleep()
	{
		System.out.println("sleeping");
	}
	
public abstract void move();
}