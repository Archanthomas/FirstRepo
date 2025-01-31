package package2;
import java.util.Scanner;
		public class Sample1

		{

		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter a number:"); 
		int num= sc.nextInt();
		int reverse= 0;
		while(num>0)

		{

		int last= num%10; //54
		reverse=(reverse*10)+last; //54
		num= num/10; //1234

		}

		System.out.println("The reverse of the number is"+" "+reverse);

		}

		


	}


