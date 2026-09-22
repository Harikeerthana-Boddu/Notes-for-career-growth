import java.lang.*;
class VariableRules{
public static void main(String args[])
{
	//case sensitive
	int a=20;
	int A=25;
	System.out.println(a); //20
	System.out.println(A); //25
	//contains numbers and Alphabets and _ or $
	String name1="Keerthana";
	System.out.println(name1);  //Keerthana
	//starts with a alphabet _ Or $
	//String 123name="hello"; //error
	String _name="Mummy"; 
	System.out.println(_name);  //Mummy
	//follows camel case
	String firstName="Yellaboina";
	System.out.println(firstName);  //Yellaboina
	//there is no limit in size
	String firstNameAddress="Yellaboina Wadapally";
	System.out.println(firstNameAddress);
	//should not be a class name if class is in use
	String VariableRules="Nani";
	System.out.println(VariableRules);





                        
}
}t