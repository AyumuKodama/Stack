/**
 * This is the interface for the implementation of a Stack class.
 * 
 * The stack should hold string data, and have a constructor with one
 * integer parameter which is the size of the stack.
 * 
 * @author Michael Ida
 *
 */
public interface StackInterface {

	public boolean push(String record);

	public String pop();

	public void printStack();
	
}