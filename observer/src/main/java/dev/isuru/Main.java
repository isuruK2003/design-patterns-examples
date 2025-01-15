package dev.isuru;

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