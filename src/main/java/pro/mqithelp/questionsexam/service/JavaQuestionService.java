package pro.mqithelp.questionsexam.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private final List<Question> questions = new ArrayList<>();
    private int size;

    public JavaQuestionService() {
        init();
        this.size = questions.size();
    }

    @Override
    public Question add(String question, String answer) {
        return new Question("question", "answer");
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        questions.get(4);
        int randNum = new Random().nextInt(this.size);
        return questions.get(randNum);
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

      private void init() {
    questions.add(new Question("Что такое JDK?", "JDK (Java Development Kit) — это комплект инструментов для разработки программ на Java, включающий компилятор, библиотеки и инструменты для отладки.?"));
    questions.add(new Question("Что такое JVM?","JVM (Java Virtual Machine) — это виртуальная машина, которая выполняет байт-код Java и обеспечивает платформонезависимость."));
    questions.add(new Question("Что такое JRE?","JRE (Java Runtime Environment) — это среда выполнения Java, которая включает JVM и стандартные библиотеки, необходимые для запуска Java-программ."));
    questions.add(new Question("Какой метод используется для запуска Java-программы?","Метод public static void main(String[] args) является точкой входа в любую Java-программу."));
    questions.add(new Question("Что такое перегрузка метода?","Перегрузка метода — это создание нескольких методов с одинаковым именем, но с разными параметрами (типами или количеством)."));
    questions.add(new Question("Что такое исключения в Java?","Исключения — это события, которые нарушают нормальное выполнение программы. В Java они обрабатываются с помощью блоков try, catch и finally."));
    questions.add(new Question("Как создать массив в Java?","Массив создается с помощью синтаксиса: int[] myArray = new int[10]; для создания массива целых чисел размером 10."));
    questions.add(new Question("Что такое интерфейс в Java?","Интерфейс — это абстрактный тип, который определяет набор методов, которые класс должен реализовать, но не содержит их реализации."));
    questions.add(new Question("Какой оператор используется для сравнения двух объектов на равенство?","Оператор == используется для сравнения ссылок на объекты, а метод .equals() — для сравнения содержимого объектов."));
    questions.add(new Question("Что такое коллекции в Java?","Коллекции — это структуры данных, которые позволяют хранить и управлять группами объектов (например, списки, множества и карты) через интерфейсы из пакета java.util."));

}
}
