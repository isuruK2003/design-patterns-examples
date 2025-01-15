package dev.isuru;

public class Main {
    public static void main(String[] args) {
        Singleton ex1 = Singleton.getExample();
        ex1.setContent("Hello World");

        Singleton ex2 = Singleton.getExample();
        String content = ex2.getContent();
        System.out.println(content);

    }
}
