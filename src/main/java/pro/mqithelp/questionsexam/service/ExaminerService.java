package pro.mqithelp.questionsexam.service;

import java.util.List;

public interface ExaminerService {
    List<Question> getQuestions(int amount);
}
