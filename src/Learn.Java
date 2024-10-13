
public class Learn {

	int i = 5;
	static int j=0;
//	static variable belongs to class not its object
//	Non static var belongs to object of class and cannot be called directly without creating an object.
	
	public static void main(String[] args) {
		
		Learn nonStatic = new Learn();
		System.out.println(nonStatic.i);
//	non static cannot be called directly via "classname.varName"
		
		System.out.println(Learn.j);
//	Static variable can be called out directly via "classname.varName"
	}

}
//Static variables are used to describe common properties of all objects.
// It gets the memory only once in the class area at the time of class loading. 
// STATIC is MEMORY EFFICIENT : new i is created every time a new object is created but not j. 