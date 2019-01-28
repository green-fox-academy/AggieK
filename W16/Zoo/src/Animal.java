public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private int fedTimes;

  public Animal(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Animal(String name) {
    this.name = name;
    this.age = 0;
    this.gender = "unknown";
  }

  public void eat() {
    fedTimes++;
  }

  abstract boolean isHungry();

  @Override
  public String toString() {
    return name + " is a" + age +
        " years old " + gender + " animal and was fed " +
        +fedTimes + " times. ";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getFedTimes() {
    return fedTimes;
  }

  public void setFedTimes(int fedTimes) {
    this.fedTimes = fedTimes;
  }
}
