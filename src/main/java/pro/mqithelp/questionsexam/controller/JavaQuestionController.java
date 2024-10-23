package pro.mqithelp.questionsexam.controller;

import org.springframework.web.bind.annotation.*;
import pro.mqithelp.questionsexam.service.Question;
import pro.mqithelp.questionsexam.service.QuestionService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/exam/")
public class JavaQuestionController {

    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("get/{amount}")
    public List<Question> find(@PathVariable(value = "amount", required = true) Integer amount) {
        return questionService.getRandomQuestion(amount);
    }

    @GetMapping("java/add")
    public String add(@RequestParam("question") String question,
                        @RequestParam("answer") String answer) {

        return questionService.add(question, answer);
    }

    @GetMapping("java/remove")
    public String remove(@RequestParam("question") String question,
                         @RequestParam("answer") String answer) {
        return questionService.remove(question,answer);
    }

    @GetMapping("java")
    public Collection<Question> getAll() {
        return questionService.getAll();
    }

}
