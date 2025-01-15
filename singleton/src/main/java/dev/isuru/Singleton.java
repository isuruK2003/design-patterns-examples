package dev.isuru;

class Singleton {
    private String content;
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getExample() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String  getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}