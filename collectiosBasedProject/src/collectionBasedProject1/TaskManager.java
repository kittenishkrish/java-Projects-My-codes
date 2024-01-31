package collectionBasedProject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Task {
	private String taskName;
	private String taskDescription;

	public Task(String taskName, String taskDescription) {
		super();
		this.taskName = taskName;
		this.taskDescription = taskDescription;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	@Override
	public String toString() {
		return "Task Name: " + taskName + "\n" + ", Task Description: " + taskDescription;
	}
}

public class TaskManager {

	private Map<String, ArrayList<Task>> categories;

	public TaskManager() {
		this.categories = new HashMap<>();
	}

	public void addTask(String categoryName, String taskName, String taskDescription) {
		categories.computeIfAbsent(categoryName, k -> new ArrayList<>()).add(new Task(taskName, taskDescription));
		System.out.println("Task added to category '" + categoryName + "': " + taskName);
	}

	public void removeTask(String categoryName, String taskName) {
		ArrayList<Task> tasks = categories.get(categoryName);
		if (tasks != null) {
			tasks.removeIf(task -> task.getTaskName().equals(taskName));
			System.out.println("Task removed from category '" + categoryName + "': " + taskName);
		} else {
			System.out.println("Category '" + categoryName + "' not found.");
		}
	}

	public void displayTasksByCategory(String categoryName) {
		ArrayList<Task> tasks = categories.get(categoryName);
		if (tasks != null && !tasks.isEmpty()) {
			System.out.println("Tasks in category '" + categoryName + "':");
			for (Task task : tasks) {
				System.out.println(task.toString());
			}
		} else {
			System.out.println("No tasks found in category '" + categoryName + "'.");
		}
	}

	public void displayAllCategories() {
		if (!categories.isEmpty()) {
			System.out.println("All Categories:");
			for (Map.Entry<String, ArrayList<Task>> entry : categories.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue().size() + " tasks");
			}
		} else {
			System.out.println("No categories found.");
		}
	}

	public static void main(String[] args) {
		TaskManager taskManager = new TaskManager();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Add Task");
			System.out.println("2. Remove Task");
			System.out.println("3. Display Tasks by Category");
			System.out.println("4. Display All Categories");
			System.out.println("5. Exit");

			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter Category Name, Task Name, and Task Description to add task:");
				String categoryNameToAdd = scanner.nextLine();
				String taskNameToAdd = scanner.nextLine();
				String taskDescriptionToAdd = scanner.nextLine();
				taskManager.addTask(categoryNameToAdd, taskNameToAdd, taskDescriptionToAdd);
				break;
			case 2:
				System.out.println("Enter Category Name and Task Name to remove task:");
				String categoryNameToRemove = scanner.nextLine();
				String taskNameToRemove = scanner.nextLine();
				taskManager.removeTask(categoryNameToRemove, taskNameToRemove);
				break;
			case 3:
				System.out.println("Enter Category Name to display tasks:");
				String categoryNameToDisplay = scanner.nextLine();
				taskManager.displayTasksByCategory(categoryNameToDisplay);
				break;
			case 4:
				taskManager.displayAllCategories();
				break;
			case 5:
				System.out.println("Exiting the Program.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid Choice. Please enter a valid option.");
			}

		}
	}
}
