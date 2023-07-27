package ru.job4j.condition;

public class Max {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int max(int left, int right) {

        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int score = max(2, 3);
        System.out.println(score);
    }
}