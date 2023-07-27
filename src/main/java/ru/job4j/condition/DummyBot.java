package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            System.out.println("Hi, SmartAss.");
        } else if ("Bye.".equals(question)) {
            System.out.println("See you later.");
        } else {
            return rsl;
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        rsl = DummyBot.answer("Bye.");
        rsl = DummyBot.answer("Who are you?");
        System.out.println(rsl);
    }
}