package pro.mqithelp.questionsexam.service;

import java.util.Collection;
import java.util.List;

public interface QuestionService {
    String add(String question, String answer);
    String remove(String question, String answer);
    List<Question> getRandomQuestion(int amount);
    Collection<Question> getAll();
}
