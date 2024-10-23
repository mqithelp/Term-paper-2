package pro.mqithelp.questionsexam.service;

public class Question {
    private String question;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    private String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
