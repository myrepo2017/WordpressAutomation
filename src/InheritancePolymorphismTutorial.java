
public class InheritancePolymorphismTutorial 
{

	public static void main(String[] args) 
	{
		Person personObj = new Person();
		System.out.println(personObj.getName());
		System.out.println(personObj.age);
		
		Students arisha = new Students("Arisha", "Khan", 4, 3.5);
		System.out.println(arisha.getName()+ "\nAge: " + arisha.age + "\nGrade : " + arisha.grade);
		
		Person md = new Students("MD", "KHAN", 38, 3.9);
		
		acceptPerson(md);
	}
	
	public static void acceptPerson(Person randPerson)
	{
		System.out.println();
		System.out.println(randPerson.getName());
		System.out.println(randPerson.age);
		System.out.println(((Students)randPerson).grade);  // Casting
		randPerson.hobby(); //Polymorphism
		
	}

}
