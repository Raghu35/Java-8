package Lambda;

/*
 * A lambda expression is a short block of code which takes in parameters and returns a value. 
 * Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
*/


/*
 * SYNTAX
 * parameter -> expression
 * (parameter1, parameter2) -> expression
 * (parameter1, parameter2) -> { code block }
*/

import java.util.ArrayList;

	public class Lambda_1 {
	  public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	  }
	}

//	Lambda expressions can be stored in variables if the variable's type is an interface which TEMPhas only one method.
//	The lambda expression should have the same number of parameters and the same return type as that method. 
//	Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util package) used by lists.
