package pro.mqithelp.questionsexam.service;

import java.util.Collection;
import java.util.List;

public interface QuestionService {
    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);
    List<Question> getRandomQuestion(int amount);
    Collection<Question> getAll();
}
