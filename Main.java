package oopproject;

public class Main {

	    public static void main(String[] args) {
	        ToDoList toDoList = new ToDoList();

	        Task task1 = new Task("Task 1", "This is task 1");
	        Task task2 = new Task("Task 2", "This is task 2");
	        Task task3 = new Task("Task 3", "This is task 3");

	        toDoList.addToDo(task1);
	        toDoList.addToDo(task2);
	        toDoList.addToDo(task3);

	        toDoList.viewToDoList();

	        toDoList.markToDoAsCompleted("Task 2");

	        toDoList.viewToDoList();
	    }
	}

