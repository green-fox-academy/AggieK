public class Todo implements Printable {
    private String name;
    private boolean completed;

    public Todo(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public void pintaAllFields() {

    }
}