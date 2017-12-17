/**
 * This is the main tester class for the Stack class.
 * 
 * @author Michael Ida
 *
 */
public class StackTester {

	public static void main(String[] args) {
		String[] testData = {"ape", "bonobo", "crocodile", "dingo",
				"elephant", "fox", "giraffe", "horse", "ibex"};
		// Create a stack of size 8
		Stack stack = new Stack(8);
		
		// Read test data onto the stack
		for (String elem : testData) {
			if (!stack.push(elem)) {
				System.out.println("STACK OVERFLOW FOR " + elem);
			} else {
				System.out.println("Successfully pushed " + elem);
			}
		}
		// There should be one STACK OVERFLOW error
		
		System.out.println();
		stack.printStack();
		// should be:
		//   horse
		//   giraffe
		//   fox
		//   elephant
		//   dingo
		//   crocodile
		//   bonobo
		//   ape
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push("ibex");
		stack.push("jaguar");
		System.out.println();
		stack.printStack();
		// Should be:
		//   jaguar
		//   ibex
		//   elephant
		//   dingo
		//   crocodile
		//   bonobo
		//   ape
	}
}