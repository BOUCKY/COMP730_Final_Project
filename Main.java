ublic class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Adding sample tasks
        taskManager.addTask(new Task("Complete project proposal", "Write proposal for task manager project", "2024-03-10", 2));
        taskManager.addTask(new Task("Finish coding task manager", "Implement task creation, task list, and task details functionality", "2024-03-15", 3));
        taskManager.addTask(new Task("Prepare presentation", "Create slides and practice presentation for project demo", "2024-03-20", 1));

        // Display all tasks
        taskManager.displayTasks();

}