package pro.mqithelp.questionsexam.service;

import org.springframework.stereotype.Service;
import pro.mqithelp.questionsexam.component.Singlton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final Singlton mySington;
    private final List<Question> questions = new ArrayList<>();

    public ExaminerServiceImpl(Singlton mySington) {
        this.mySington = mySington;

    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        questions = (List<Question>) mySington;
        return null;
    }
}
