public class Things implements Comparable<Things> {
        private String name;
        private boolean completed;

        public Things(String name) {
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
    public int compareTo(Things o) {
        return 0;
    }
}
