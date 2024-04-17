class Task {
    private String name;
    private String description;
    private String dueDate;
    private boolean isComplete;
    private int priority; // Priority level: 1 (low), 2 (medium), 3 (high)

    // Constructor
    public Task(String name, String description, String dueDate, int priority) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = false;
        this.priority = priority;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    // Method to toggle task completion status
    public void toggleCompletion() {
        isComplete = !isComplete;
    }
}