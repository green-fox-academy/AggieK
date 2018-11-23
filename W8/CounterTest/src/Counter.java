public class Counter {

    int value;
    int value2;

    public Counter() {
        this.value = 0;
        this.value2 = 0;
    }

    public Counter(int value) {
        this.value = value;
        this.value2 = value;
    }

    public void add(){
        value++;
    }

    public void add(int number) {
        value += number;
    }

    public int get(){
        return value;
    }

    public void reset(){
        value = value2;
    }

    @Override
    public String toString() {
        return "Counter: value= " + value + ", value2= " + value2 ;
    }
}
