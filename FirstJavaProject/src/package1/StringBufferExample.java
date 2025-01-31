package package1;

public class StringBufferExample {

 public static void main(String[] args) {
			
				StringBuffer a = new StringBuffer("Hello");
				a.append(" World");    //append method
				System.out.println(a);  
				
				
				a.insert(6,"Good ");    //insert method
				System.out.println(a);
				
				
				a.replace(11, 16, "Nation");  //replace method 
				System.out.println(a);        
				
				
				a.delete(6, 10);
				System.out.println(a);      //delete method
				
				a.reverse();
				System.out.println(a);    //reverse method
			}

		}


