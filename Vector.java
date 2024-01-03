import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Vector<String> emp=new Vector<>();
		emp.add("Anish");emp.add("Mamish");emp.add("Sonali");emp.add("Ayush");emp.add("Ashish");
		emp.add("Chinmay");emp.add("Bhavesh");emp.add("Arjun");emp.add("aryan");emp.add("atharava");
		emp.add("REaj");emp.add("Ansh");
	    System.out.println(emp);
	    emp.remove(8);
	    
	    Vector<String> copy=new Vector<>();
	    for(int i=0;i<emp.size();i++){
	        copy.add(emp.get(i));
	    }
	    System.out.println(copy);
	    System.out.println("Size of copy vector is "+copy.size());
	    
	    
	}
}
