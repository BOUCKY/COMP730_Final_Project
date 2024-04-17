class TaskManager {
    private List<Task> tasks;

    // Constructor
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to display all tasks
    public void displayTasks() {
        System.out.println("----- Tasks -----");
        for (Task task : tasks) {
            System.out.println(task.getName() + " - Due: " + task.getDueDate() + " - Priority: " + task.getPriority() + " - Complete: " + task.isComplete());
        }
        System.out.println("-----------------");
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