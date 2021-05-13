package sample.QuestionSection;

public class QuestionAndAnswer
{
    private String Questions;
    private String Answer;
    private String Wrong1;
    private String Wrong2;
    private String Wrong3;

    public QuestionAndAnswer(String questions, String answer, String wrong1, String wrong2, String wrong3) {
        Questions = questions;
        Answer = answer;
        Wrong1 = wrong1;
        Wrong2 = wrong2;
        Wrong3 = wrong3;
    }

    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getWrong1() {
        return Wrong1;
    }

    public void setWrong1(String wrong1) {
        Wrong1 = wrong1;
    }

    public String getWrong2() {
        return Wrong2;
    }

    public void setWrong2(String wrong2) {
        Wrong2 = wrong2;
    }

    public String getWrong3() {
        return Wrong3;
    }

    public void setWrong3(String wrong3) {
        Wrong3 = wrong3;
    }
}
