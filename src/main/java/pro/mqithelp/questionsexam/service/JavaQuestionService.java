package pro.mqithelp.questionsexam.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private final List<Question> questions = new ArrayList<>();

    public JavaQuestionService() {
        init();
    }

    @Override
    public String add(String question, String answer) {
        if (isUnicumQuestion(question, answer)) {
            questions.add(new Question(question, answer));
        } else {
            throw new IndexOutOfBoundsException("BAD_REQUEST");
        }
        return "Вопрос и ответ добавлены.";
    }

    @Override
    public String remove(String question, String answer) {
        if (!isUnicumQuestion(question, answer)) {
            Question temp = new Question(question, answer);
            questions.remove(temp);
        } else {
            throw new IndexOutOfBoundsException("BAD_REQUEST");
        }
        return "Вопрос и ответ удалены.";
    }

    @Override
    public List<Question> getRandomQuestion(int amount) {
        if (amount > getSize()) {
            throw new IndexOutOfBoundsException("");
        }
        List<Question> result = new ArrayList<>();
        Integer[] listRndIndex = getMixArrayForRandomQuestion(getSize());
        for (int i = 0; i < amount; i++) {
            result.add(questions.get(listRndIndex[i]));
        }
        return result;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    private Integer[] getMixArrayForRandomQuestion(int n) {
        List<Integer> list = new ArrayList<>(n);
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        list.toArray(result);
        return result;
    }

    private void init() {
        questions.add(new Question("1) Что такое JDK?", "JDK (Java Development Kit) — это комплект инструментов для разработки программ на Java, включающий компилятор, библиотеки и инструменты для отладки.?"));
        questions.add(new Question("2) Что такое JVM?", "JVM (Java Virtual Machine) — это виртуальная машина, которая выполняет байт-код Java и обеспечивает платформонезависимость."));
        questions.add(new Question("3) Что такое JRE?", "JRE (Java Runtime Environment) — это среда выполнения Java, которая включает JVM и стандартные библиотеки, необходимые для запуска Java-программ."));
        questions.add(new Question("4) Какой метод используется для запуска Java-программы?", "Метод public static void main(String[] args) является точкой входа в любую Java-программу."));
        questions.add(new Question("5) Что такое перегрузка метода?", "Перегрузка метода — это создание нескольких методов с одинаковым именем, но с разными параметрами (типами или количеством)."));
        questions.add(new Question("6) Что такое исключения в Java?", "Исключения — это события, которые нарушают нормальное выполнение программы. В Java они обрабатываются с помощью блоков try, catch и finally."));
        questions.add(new Question("7) Как создать массив в Java?", "Массив создается с помощью синтаксиса: int[] myArray = new int[10]; для создания массива целых чисел размером 10."));
        questions.add(new Question("8) Что такое интерфейс в Java?", "Интерфейс — это абстрактный тип, который определяет набор методов, которые класс должен реализовать, но не содержит их реализации."));
        questions.add(new Question("9) Какой оператор используется для сравнения двух объектов на равенство?", "Оператор == используется для сравнения ссылок на объекты, а метод .equals() — для сравнения содержимого объектов."));
        questions.add(new Question("10) Что такое коллекции в Java?", "Коллекции — это структуры данных, которые позволяют хранить и управлять группами объектов (например, списки, множества и карты) через интерфейсы из пакета java.util."));

    }
    public int getSize() {
        return questions.size();
    }
    private boolean isUnicumQuestion(String question, String answer) {
        return !questions.contains(new Question(question, answer));
    }
    public Collection<Question> getListQuestions() {
        return questions;
    }
}
