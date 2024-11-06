import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Task> tasks;

    public Category(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void displayAllTasks() {
        System.out.println("Category: " + name);
        for (Task task : tasks) {
            task.displayTask();
        }
    }
}
