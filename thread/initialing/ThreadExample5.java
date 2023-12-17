package thread.initialing;

/**
 * Un aspecto particular es que, el metodo main, tambien se ejecuta sobre su propio hilo, por lo que al usar el metodo
 * Thread.sleep() en el metodo main, provoca que la ejecucion del metodo main se detenga mientras otros hilos pueden seguir
 * corriendo con tranquilidad
 */
public class ThreadExample5 {

    public static class StoppableRunnable implements Runnable {

        public boolean stopRequest = false;

        public synchronized void requestStop() {
            this.stopRequest = true;
        }

        public synchronized boolean isStopRequest() {
            return this.stopRequest;
        }

        public void sleep(long mili) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void run() {

            System.out.println("StoppableRunnable Running");

            while (!isStopRequest()) {
                sleep(1000);
                System.out.println("...");
            }

            System.out.println("StoppableRunnable Stopped");

        }
    }

    public static void main(String[] args) {

        StoppableRunnable stoppableRunnable = new StoppableRunnable();

        Thread thread = new Thread(stoppableRunnable);
        thread.start();

        try {
            Thread.sleep(5000);

            System.out.println("Requesting stop");
            stoppableRunnable.requestStop();
            System.out.println("Stop request");

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}












