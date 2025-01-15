import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observable obs = new Observable();

        for (int i = 0; i < 10; i++) {
            Observer observer = new Observer("observer-" + i);
            obs.add(observer);
        }

        new Thread(() -> {
            try {
                while (obs.getCurrentNumber() < 10) {
                    obs.updateStatus();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }).start();
    }
}

class Observable {
    private final List<Observer> observers;
    private Integer currentNumber;

    public Observable() {
        this.observers = new ArrayList<>();
        this.currentNumber = 0;
    }

    public synchronized void add(Observer observer) {
        this.observers.add(observer);
    }

    public synchronized void remove(Observer observer) {
        this.observers.remove(observer);
    }

    private synchronized void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.notifyObserver("Current number: " + currentNumber);
        }
    }

    public synchronized void updateStatus() {
        this.currentNumber++;
        this.notifyObservers();
    }
    
    public synchronized Integer getCurrentNumber() {
        return this.currentNumber;
    }
}

class Observer {
    private final String name;

    public Observer(String name) {
        this.name = name;
    }

    public void notifyObserver(String message) {
        System.out.println(name + " notified: " + message);
    }
}
