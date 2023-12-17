package thread.initialing;

/**
 * Otra forma de trabajar con hilos es implementar la interface Runnable, sobreescribir el metodo run() y luego instanciar un objeto
 * del tipo Thread con cualquier clase que implemente la interface Runnable.
 */
public class ThreadExample2{

    public static class MyRunnable implements Runnable {

        public void run() {
            System.out.println(Thread.currentThread().getName() + " running");
        }

    }

    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable(), "Thread");

        thread.start();

    }


}
