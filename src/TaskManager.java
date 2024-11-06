import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Category> categories;

    public TaskManager() {
        categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void displayAllCategories() {
        for (Category category : categories) {
            category.displayAllTasks();
        }
    }
}