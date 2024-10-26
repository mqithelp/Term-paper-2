package pro.mqithelp.questionsexam.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final JavaQuestionService javaQuestionService;

    public ExaminerServiceImpl(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @Override
    public List<Question> getQuestions(int amount) {
        return javaQuestionService.getRandomQuestion(amount);
    }

}
