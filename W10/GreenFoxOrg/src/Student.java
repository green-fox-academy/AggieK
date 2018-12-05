public class Student extends Person{

    public String previousOrganization;
    public int skippedDays;

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void introduce (){
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " from " +
                previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public int skipDays(int numberOfDays){
        skippedDays += numberOfDays;
        return skippedDays;
    }

    public Student(String name, int age, String gender, String previousOrganization){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student (){
        this.name = "Jane Does";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life" ;
        this.skippedDays = 0;
    }
}




