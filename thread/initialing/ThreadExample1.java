package thread.initialing;

/**
 * Podemos trabajar con hilos creando una clase que extienda de la clase Thread y personalizarla
 */
public class ThreadExample1 {


    public static class MyThread extends Thread{

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + " running");
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread("Thread 1");
        thread.start();

    }
}
