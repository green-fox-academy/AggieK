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
        for (int i = 0; i < list.list.size(); i++) {
            if (list.list.get(i).getDescription().equals(newTask)) {
                list.list.remove(i);
            }
        }
        FileManipulation.writeTodoListToFile(filename, list);
    }

    public void completed(String newTask) {
        TodoList todoList1 = FileManipulation.readTodoListFromFile(filename);
        for (int i = 0; i < todoList1.list.size(); i++) {
            if (todoList1.list.get(i).getDescription().equals(newTask)) {
                todoList1.list.get(i).setCompleted(true);
            }
            FileManipulation.writeTodoListToFile(filename, todoList1);
        }
    }

    public String printTasks() {
        TodoList todoList = FileManipulation.readTodoListFromFile(filename);
        String string = "";
        for (int i = 0; i < todoList.list.size(); i++) {
            string += i + 1 + " ";
            string += todoList.list.get(i).toString() + "\n";
        }
        return string;
    }
}