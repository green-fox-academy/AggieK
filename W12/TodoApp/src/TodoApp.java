import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TodoApp {

    public static void main(String[] args) {
        TodoList todolist = new TodoList();
        try {
            if (args.length == 0) {
                System.out.println(TodoList.printUsage());
            } else if (args[0].equals("-l")) {
                System.out.println(todolist.printTasks());
            } else if (args[0].equals("-a")) {
                todolist.add(args[1]);
            } else if (args[0].equals("-r")) {
                todolist.remove(args[1]);
            } else if (args[0].equals("-c")) {
                todolist.completed(args[1]);
            } else {
                System.out.println("Sorry, we have no such task! Available tasks listed below:");
                System.out.println(TodoList.printUsage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unable to procede: no task provided");
        }
    }
}
