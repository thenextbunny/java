package list.Basic.TaskList;

public class Task {
    private String task;

    public Task (String task) {
       this.task = task;
    }

    public String getDescription() {
        return task;
    }


    @Override
    /**
     * It's necessary because getDescription returns the memory address when is called without this
     */
    public String toString() {
        return task.toString();
    }
}
