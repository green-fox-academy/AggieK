public class Teachers {

    private String name;
    private String subject;
    private int numberOfStudents;
    private int questionsAnswered;

    public Teachers (String name){
        this.name = name;
        this.subject = subject;
        questionsAnswered = 0;
        numberOfStudents = 0;
    }

    public void teach(Students name){
        name.learn();
        numberOfStudents++;
    }

    public void answered(){
        questionsAnswered++;
    }

    public String toString() {
        return "Teacher " + name + "had " + numberOfStudents + "students and answered " + questionsAnswered + "questions. " ;
    }
}
