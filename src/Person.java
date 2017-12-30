/**
 * 
 */

/**
 * @author mdkha
 *
 */
public class Person 
{
	private String firstName = "Tasnuva";
	private String lastName = "Adrita";
	public int age = 10;
	
	protected  final void changeName(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	protected final String getName()
	{
		return this.firstName + " " + this.lastName; 
	}
	
	public int ageofPerson()
	{
		return this.age;
	}
	
	public void hobby()
	{
		System.out.println("Hobby of " + this.firstName + " " + this.lastName + " " + "Singing");
	}
	
	public Person()
	{
		
	}
	public Person(String firstName, String lastName, int age)
	{
		this.changeName(firstName, lastName);
		this.age = age;
	}
	
}
