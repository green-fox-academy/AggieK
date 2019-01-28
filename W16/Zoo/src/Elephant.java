public class Elephant extends  Animal{

  public Elephant (String name, int age, String gender){
    super(name,age,gender);
  }

  public Elephant (String name){
    super(name);
  }

  @Override
  boolean isHungry() {
    return this.getFedTimes() % 2 == 0;
  }
}
