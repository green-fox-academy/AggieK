public class Monkey extends Animal {

  public Monkey(String name, int age, String gender) {
    super(name, age, gender);
  }

  public Monkey(String name) {
    super(name);
  }

  @Override
  boolean isHungry() {
    return Math.random() < 0.5;
  }
}
