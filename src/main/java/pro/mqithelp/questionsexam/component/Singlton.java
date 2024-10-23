package pro.mqithelp.questionsexam.component;

import org.springframework.stereotype.Component;
import pro.mqithelp.questionsexam.service.Question;

import java.util.ArrayList;
import java.util.List;

@Component
public class Singlton {
    private List<Question> qu = new ArrayList<>();
    private Singlton() {
    setup();
    }
    public void setup(){
        qu.add(new Question("55) Что такое перегрузка метода?", "Перегрузка метода — это создание нескольких методов с одинаковым именем, но с разными параметрами (типами или количеством)."));
        qu.add(new Question("77) Что такое исключения в Java?", "Исключения — это события, которые нарушают нормальное выполнение программы. В Java они обрабатываются с помощью блоков try, catch и finally."));
    }

    public List<Question> getQu() {
        return qu;
    }
}
