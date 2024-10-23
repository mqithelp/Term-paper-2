package pro.mqithelp.questionsexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.mqithelp.questionsexam.service.QuestionService;

@RestController
@RequestMapping("/exam/")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("get/{amount}")
    public String find(@PathVariable(value = "amount", required = false) Integer amount) {
        return questionService.getRandomQuestion(amount).toString();
    }
    @GetMapping("java/add")
    public String add() {
        return questionService.add("question","answer").toString();
    }
    @GetMapping("java/remove")
    public String remove() {
        return null;
    }
    @GetMapping("java/find")
    public String find() {
        return questionService.getRandomQuestion(2).toString();
    }
}
