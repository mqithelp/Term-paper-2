package pro.mqithelp.questionsexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.mqithelp.questionsexam.service.QuestionService;

@RestController
@RequestMapping("/exam/java/")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("add")
    public String add() {
        return questionService.add("question","answer").toString();
    }
    @GetMapping("find")
    public String find() {
        return questionService.getRandomQuestion().toString();
    }
}
