package thread.concurrency;

public class ThreadExample2 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        StaticSynchronizedExchanger.setO(i);
                    }
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        System.out.println(StaticSynchronizedExchanger.getO());
                    }
                }
        );

        thread1.start();
        thread2.start();
    }

}
