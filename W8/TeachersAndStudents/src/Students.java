public class Students {

    private String name;
    private int subjectLearned;
    private int questionAsked;

    public Students(String name){
        this.name = name;
        subjectLearned = 0;
        questionAsked = 0;
    }

    public void learn (){
        subjectLearned++;
    }

    public void question(Teachers name){
        name.answered();
        questionAsked++;
    }

    @Override
    public String toString() {
        return name + " completed " + subjectLearned + " classes and asked " + questionAsked + " questions.";
    }
}
