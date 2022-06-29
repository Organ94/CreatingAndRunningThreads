package threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private int count = 0;

    @Override
    public String call() {
        try {
            while (random() != 4) {
                Thread.sleep(2500);
                System.out.println(Thread.currentThread().getName() + ". Всем привет!");
                count++;
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.println(Thread.currentThread().getName() + ". завершен");
        }
        return Thread.currentThread().getName() + " - " + count;
    }

    private int random() {
        return (int) (Math.random() * 7);
    }
}
