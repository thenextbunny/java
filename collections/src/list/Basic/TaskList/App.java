package list.Basic.TaskList;

public class App {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        printTotalTasks(taskList);

        taskList.addTask("Study Java");
        taskList.addTask("Make dinner");

        printTotalTasks(taskList);

        taskList.removeTask("Study Java");

        printTotalTasks(taskList);

        taskList.getTasks();
    }

    public static void printTotalTasks(TaskList taskList) {
        System.out.println(STR."Tasks total: \{taskList.getTotalTasks()}");
    }
}
