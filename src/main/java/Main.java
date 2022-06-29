import threads.MyThread;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Создаю потоки...");

        ThreadGroup mainGroup = new ThreadGroup("Главая группа");

        MyThread thread1 = new MyThread(mainGroup, "Поток-1");
        MyThread thread2 = new MyThread(mainGroup, "Поток-2");
        MyThread thread3 = new MyThread(mainGroup, "Поток-3");
        MyThread thread4 = new MyThread(mainGroup, "Поток-4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(10000);

        mainGroup.interrupt();
    }
}
