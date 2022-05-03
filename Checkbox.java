import java.util.ArrayList;

public class Checkbox extends Question{

    private ArrayList<String> answerOptions;

    //it incorporated answerOptions with generate after initializing that first
    public Checkbox(String question, String correctAnswer, Integer pointValue, ArrayList<String> answerOptions) {
        super(question, correctAnswer, pointValue);
        this.answerOptions = answerOptions;
    }
}
