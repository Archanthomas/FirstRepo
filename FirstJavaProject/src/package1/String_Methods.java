package package1;

public class String_Methods {

	public static void main(String[] args) {
		
		String a ="Hello my name is Archana";
		int size= a.length();   //length method
		System.out.println(size);
char get = a.charAt(4);           //charAt method
System.out.println(get);

int b= 50;
String c= String.valueOf(b);     //valueOf method
System.out.println(c);

String d="Hello";
String e="hello";
String f="Hello";
System.out.println(d.equals(e));         //equals method
System.out.println(d.equals(f));
System.out.println(d.equalsIgnoreCase(f));

String x = "Hello";            //concat
String y= x.concat(" World");   
String z= y.concat(" Day");
System.out.println(z);
		
     
String array[]= a.split(" ");   //split method

for(int i=0;i<array.length;i++)
{
System.out.println(array[i]);	
}

//System.out.println(array[4]);

// For each loop

String g[] = {"AB","CD","EF"};
for(String h:g)
	
{
	System.out.println(h);
}

	}

}
