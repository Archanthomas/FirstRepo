package package1;

public class This_Keyword 

{

	public static void main(String[] args) {
		
		This_Keyword obj= new This_Keyword();
		obj.instance();
		//obj.instance(5);
		
		
		
	}
		
		public void instance()
		{
		
		System.out.println("This keyword");	
		
		this.instance1(10);
		this.sample();
		
			
		}
		
		public void instance1(int a)
		{
			
		System.out.println(a);	
		
			
		}
		
		public void sample()
		{
			
			System.out.println("New method");
			
		}

	}


