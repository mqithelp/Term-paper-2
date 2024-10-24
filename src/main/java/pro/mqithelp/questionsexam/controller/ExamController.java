package pro.mqithelp.questionsexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.mqithelp.questionsexam.service.ExaminerService;
import pro.mqithelp.questionsexam.service.Question;

import java.util.List;

@RestController
@RequestMapping("/exam/")
public class ExamController {
private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("get/questions/{amount}")
    public List<Question> getQuestions(@PathVariable(value = "amount", required = true) Integer amount) {
        return examinerService.getQuestions(amount);
    }
}
