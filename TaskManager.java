import java.util.Scanner;

class TaskManager {
    private List<Task> tasks;
    private Scanner scanner;

    // Constructor
    public TaskManager() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Method to add a task
    public void addTask() {
    try {
        System.out.println("Enter task name:");
        String name = scanner.nextLine();
        System.out.println("Enter task description:");
        String description = scanner.nextLine();
        System.out.println("Enter due date (YYYY-MM-DD):");
        String dueDate = scanner.nextLine();
        System.out.println("Enter priority level (1 for low, 2 for medium, 3 for high):");
        int priority = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Validate priority input
        if (priority < 1 || priority > 3) {
            System.out.println("Invalid priority level! Priority must be 1, 2, or 3.");
            return; // Exit the method if priority is invalid
        }

        Task task = new Task(name, description, dueDate, priority);
        tasks.add(task);

        System.out.println("Task added successfully!");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input! Please enter valid data.");
        scanner.nextLine(); // Consume invalid input
    }
}

    // Method to display all tasks
    public void displayTasks() {
        System.out.println("----- Tasks -----");
        for (Task task : tasks) {
            System.out.println(task.getName() + " - Due: " + task.getDueDate() + " - Priority: " + task.getPriority() + " - Complete: " + task.isComplete());
        }
        System.out.println("-----------------");
    }

    // Method to display all tasks sorted by due date
    public void displayTasksSortedByDueDate() {
        Collections.sort(tasks, (t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate()));
        displayTasks();
    }

    // Method to display all tasks sorted by priority
    public void displayTasksSortedByPriority() {
        Collections.sort(tasks, (t1, t2) -> Integer.compare(t1.getPriority(), t2.getPriority()));
        displayTasks();
    }

    // Method to mark a task as complete
    public void markTaskComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setComplete(true);
        } else {
            System.out.println("Invalid task index!");
        }
    }

    // Method to delete a task
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index!");
        }
    }

    // Method to create a task
    public void createTask(String name, String description, String dueDate, int priority) {
    Task task = new Task(name, description, dueDate, priority);
    addTask(task); // Add the task to the list
    }

    // Add a method to edit task details
    public void editTask(int index, String newName, String newDescription, String newDueDate, int newPriority) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setName(newName);
            task.setDescription(newDescription);
            task.setDueDate(newDueDate);
            task.setPriority(newPriority);
            System.out.println("Task details updated successfully!");
        } else {
            System.out.println("Invalid task index!");
        }
    }
}

