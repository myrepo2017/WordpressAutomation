
public class Students extends Person
{
	public double grade = 3.2;
	public void gradeOfStudent()
	{
		System.out.println("Grade: " + grade);
	}
	
	public void hobby()
	{
		System.out.println("Hobby of " + this.getName() +" football");
	}
	
	public double getGrade()
	{
		return this.grade;
	}
	
	public Students()
	{
		
	}
	
	public Students(String firstName, String lastName, int age, double grade)
	{
		super(firstName, lastName, age);
		this.grade = grade;
	}
}
