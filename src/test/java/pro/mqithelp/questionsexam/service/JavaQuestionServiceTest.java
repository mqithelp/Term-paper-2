package pro.mqithelp.questionsexam.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    private QuestionService questionService;// = new JavaQuestionService();

    @BeforeEach
    void setUp() {
        questionService = new JavaQuestionService();
        questionService.add("Вопрос 1", "Ответ 1");
        questionService.add("Вопрос 2", "Ответ 2");
        questionService.add("Вопрос 3", "Ответ 3");
        questionService.add("Вопрос 4", "Ответ 4");
    }

    @Test
    void addNewQuestionTest() {
        String result = "Вопрос и ответ добавлены.";
        String question = "Вопрос 5";
        String answer = "Ответ 5";
        assertEquals(result, questionService.add(question, answer));
    }

    @Test
    void addExistQuestion() {
        String question = "Вопрос 2";
        String answer = "Ответ 2";
        assertThrows(IndexOutOfBoundsException.class, () -> {
            questionService.add(question, answer);
        });
    }


    @Test
    void removeExistQuestionTest() {
        String result = "Вопрос и ответ удалены.";
        String question = "Вопрос 1";
        String answer = "Ответ 1";
        assertEquals(result, questionService.remove(question, answer));
    }

    @Test
    void removeNotExistQuestion() {
        String question = "Вопрос 5";
        String answer = "Ответ 5";
        assertThrows(IndexOutOfBoundsException.class, () -> {
            questionService.remove(question, answer);
        });
    }

    @Test
    void getRandomQuestion() {
        int amount = 2;
        assertEquals(amount, questionService.getRandomQuestion(amount).size());
    }
    @Test
    void getRandomQuestionIndexOutOfRange() {
        int amount = -1;
        assertThrows(IndexOutOfBoundsException.class, () -> questionService.getRandomQuestion(amount).size());
    }

}