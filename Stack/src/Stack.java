/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	// Set up the basic elements of your data structure here.
	private Node head;
	private int limit;
	/*
	 * This is the constructor for the Stack class.  Notice
	 * there is one integer parameter (the size of the stack).
	 */
	public Stack(int size) {
		limit = size;
		head = null;
	}
	
	public boolean push(String record) {
		Node pointer = head;
		int counter = 0;
		while (pointer != null) {
			counter++;
			pointer = pointer.next;
		}
		if (counter >= limit) {
			return false;
		} else {
			Node newNode = new Node();
			newNode.record = record;
			if (head != null) {
				newNode.next = head;
				head = newNode;
			} else {
				head = newNode;
			}
			return true;
		}
	}
		
	public String pop() {
		String temp = head.record;
		head = head.next;
		return temp;
	}
	
	/*
	 * This method prints out the elements in the stack.
	 */
	public void printStack() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
	}

	
}