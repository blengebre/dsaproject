package dsa;

public class LinkedList {
	
	    Node head;

	    public void insertAtPos(int data, int pos) {
	        Node newNode = new Node(data);
	        if (pos == 1) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        int count = 1;
	        while (current!= null && count < pos - 1) {
	            current = current.next;
	            count++;
	        }
	        if (current == null) {
	            System.out.println("Position out of range");
	            return;
	        }
	        newNode.next = current.next;
	        current.next = newNode;
	    }

	    public void deleteAtPosition(int pos) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        if (pos == 1) {
	            head = head.next;
	            return;
	        }
	        Node current = head;
	        int count = 1;
	        while (current!= null && count < pos - 1) {
	            current = current.next;
	            count++;
	        }
	        if (current == null || current.next == null) {
	            System.out.println("Position out of range");
	            return;
	        }
	        current.next = current.next.next;
	    }

	    public void deleteAfterNode(Node node) {
	        if (node == null || node.next == null) {
	            System.out.println("Node not found or node is last node");
	            return;
	        }
	        node.next = node.next.next;
	    }

	    public boolean searchNode(int data) {
	        Node current = head;
	        while (current!= null) {
	            if (current.data == data) {
	                return true;
	            }
	            current = current.next;
	        }
	        return false;
	    }

	    public void printList() {
	        Node current = head;
	        while (current!= null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

