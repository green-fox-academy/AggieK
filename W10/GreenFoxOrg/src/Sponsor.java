public class Sponsor extends Person {

    public String company;
    public int hiredStudents;

    public void introduce(){
        System.out.println("Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far.");
    }

    public int hire(){
        hiredStudents ++;
        return hiredStudents;
    }

    public void getGoal(){
        System.out.println( "Hire brilliant junior software developers.");
    }

    public Sponsor(String name, int age, String gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor (){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }
}
