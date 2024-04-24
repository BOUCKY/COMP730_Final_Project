import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----- Task Manager Menu -----");
            System.out.println("1. Add Task");
            System.out.println("2. Display All Tasks");
            System.out.println("3. Display Tasks Sorted by Due Date");
            System.out.println("4. Display Tasks Sorted by Priority");
            System.out.println("5. Mark Task as Complete");
            System.out.println("6. Delete Task");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    taskManager.addTask();
                    break;
                case 2:
                    taskManager.displayTasks();
                    break;
                case 3:
                    taskManager.displayTasksSortedByDueDate();
                    break;
                case 4:
                    taskManager.displayTasksSortedByPriority();
                    break;
                case 5:
                    System.out.println("Enter the index of the task to mark as complete:");
                    int completeIndex = scanner.nextInt();
                    taskManager.markTaskComplete(completeIndex);
                    break;
                case 6:
                    System.out.println("Enter the index of the task to delete:");
                    int deleteIndex = scanner.nextInt();
                    taskManager.deleteTask(deleteIndex);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
