public abstract class Task {
    protected String description;
    protected int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public abstract void displayTask();
}
