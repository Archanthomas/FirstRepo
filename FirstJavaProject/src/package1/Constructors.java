package package1;

public class Constructors {

	public static void main(String[] args) {
		
		// instance variable
		Constructors obj= new Constructors();
		//Constructors obj1= new Constructors(15);
		//Constructors obj2= new Constructors(10.5f);
		
		

	}

	public Constructors()
	{
	this(5);	
	System.out.println("Non parameterized constructor");
		
	}
	
	public Constructors(int a)
	{
	this(6.7f);
	System.out.println(a);
		
	}
	
	public Constructors(float a)
	
	{
	System.out.println(a);
		
	}
	
	
}
