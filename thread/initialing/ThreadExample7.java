package thread.initialing;

/**
 * Sin embargo, detener los procesos en ocasiones no es una buena idea, por lo general es mejor terminar todos los procesos
 * antes de detener el programa.
 *
 * Para esto podemos utilizar el metodo join(), este metodo nos permite que un hilo pueda terminar sus procesos aunque el hilo del procesos
 * main haya terminado, una vez finalice, el programa dara su fin.
 */
public class ThreadExample7 {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {

            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread running");
            }

        };


        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();

    }

}
