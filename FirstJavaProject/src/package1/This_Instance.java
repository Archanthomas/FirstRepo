package package1;

public class This_Instance {
	
	int a; // instance variable;

	public static void main(String[] args) {
		
		This_Instance obj = new This_Instance(3);
		obj.instance();

	}
	
	public void instance()
	{
		
	System.out.println(a);
		
	}
	
	public This_Instance(int a) // local variable   It's valid only within the constructor.
	
	{
	this.a= a;	// assigns the value of the local variable a (the argument passed to the constructor) to the instance variable a of the current object.
		
	}

}
