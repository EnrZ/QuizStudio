import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Question {

    String contentOfQuestion;

    private String question;
    private String correctAnswer;
    private ArrayList<String> answerOptions;
    private Integer pointValue;
    private Boolean correct;

    public Question(String question, String correctAnswer, Integer pointValue){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answerOptions = answerOptions;
        this.pointValue = pointValue;
    }

    public String askQuestion(){
        return "I asked";
    }

    public String gradeQuestion(){
        return "I graded tour question.";
    }


}
