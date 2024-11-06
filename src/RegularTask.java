public class RegularTask extends Task{
    public RegularTask(String description, int priority) {
        super(description, priority);
    }

    @Override
    public void displayTask() {
        System.out.println("Regular Task - Description: " + description + ", Priority: " + priority);
    }
}
