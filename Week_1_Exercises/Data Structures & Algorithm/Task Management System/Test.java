package taskmanagementsystem;

public class Test {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Complete Project Report", "Pending"));
        manager.addTask(new Task(2, "Attend Team Meeting", "Completed"));
        manager.addTask(new Task(3, "Submit Expense Report", "Pending"));

        System.out.println("All tasks:");
        manager.traverseTasks();

        System.out.println("\nSearching for task with ID 2:");
        Task task = manager.searchTaskById(2);
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting task with ID 1:");
        boolean deleted = manager.deleteTaskById(1);
        if (deleted) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nAll tasks after deletion:");
        manager.traverseTasks();
    }
}
