package dev.isuru;

class Observer {
    private final String name;

    public Observer(String name) {
        this.name = name;
    }

    public void notifyObserver(String message) {
        System.out.println(name + " notified: " + message);
    }
}