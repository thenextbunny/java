package list.Basic.TaskList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    /**
     * To be a constructor need to have the same class name
     */
    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    /**
     * This method use a repeat loop to remove all tasks with the same description
     */
    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();

        // Add descriptions to tasks to remove list
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(task);
            }
        }

        tasks.removeAll(tasksToRemove);
    }

    /**
     * Get total tasks using size
     */
    public int getTotalTasks() {
       if (tasks == null) return 0;
       return tasks.size(); 
    }

    public void getTasks() {
        System.out.println(tasks);
    }
}
