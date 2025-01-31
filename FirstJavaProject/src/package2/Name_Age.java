package package2;

import java.util.Scanner;

public class Name_Age {

	static String name;
    static int age;
	public static void main(String[] args) {
		
		Name_Age.Name();
		Name_Age.Age();
		 System.out.println("Name: " + name);
	        System.out.println("Age: " + age);

	}

	public static void Name()
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your Name:");
	 name = sc.nextLine();
		
	}
	
	public static void Age()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Age:");
	     age = sc.nextInt();
			
		
		
	}
}
