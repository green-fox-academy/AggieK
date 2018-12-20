import java.io.Serializable;
import java.util.ArrayList;

public class TodoList implements Serializable {

    private ArrayList<Todo> list;

    private String filename = "../src/todolist.txt";

    public TodoList() {
        this.list = new ArrayList<Todo>();
    }

    public static String printUsage() {
        String usage = "Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                " -l   Lists all the tasks\n" +
                " -a   Adds a new task\n" +
                " -r   Removes a task\n" +
                " -c   Completes a task";
        return usage;
    }

    public void add(String newTask) {
        TodoList list = FileManipulation.readTodoListFromFile(filename);
        Todo todo = new Todo(newTask);
        list.list.add(todo);
        FileManipulation.writeTodoListToFile(filename, list);
    }

    public void remove(String newTask) {
        TodoList list = FileManipulation.readTodoListFromFile(filename);
        Todo todo = new Todo (newTask);
        list.list.remove(newTask);
        FileManipulation.writeTodoListToFile(filename, list);
    }

    public void completed(String newTask) {
    }

    public String printTasks() {
        String string = "";
        for (int i = 0; i < list.size(); i++) {
            string += i + 1 + " ";
            string += list.get(i).toString();
        }
        return string;
    }
}




