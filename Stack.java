package dsa;

public class Stack {

	    LinkedList list;

	    public Stack() {
	        list = new LinkedList();
	    }

	    public void push(int data) {
	        list.insertAtPos(data, 1);
	    }

	    public int pop() {
	        if (list.head == null) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        int data = list.head.data;
	        list.deleteAtPosition(1);
	        return data;
	    }

	    public int peek() {
	        if (list.head == null) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return list.head.data;
	    }

	    public void printStack() {
	        list.printList();
	    }
	}

