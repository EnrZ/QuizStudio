import java.util.ArrayList;

public class MultipleChoice extends  Question{
    public MultipleChoice(String question, String correctAnswer, Integer pointValue) {
        super(question, correctAnswer, pointValue);
    }
//can generate constructor after extending question
  //  public MultipleChoice(String question, String correctAnswer, ArrayList<String> answerOptions, Integer pointValue) {
       // super(question, correctAnswer, answerOptions, pointValue);
  //  }
}
