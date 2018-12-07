public class Student extends Person implements Cloneable {

    public String previousOrganization;
    public int skippedDays;

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() + " from " +
                previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public int skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
        return skippedDays;
    }

    Student(String name, int age, String gender, String previousOrganization) {
        super();
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student clone = new Student(this.getName(), this.getAge(), this.getGender(), this.previousOrganization);
        return clone;
    }
}





