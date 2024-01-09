package thread.java.memory.model;

/**
 * Al trabajar con threads, tenemos la seguridad de que cada hilo ejecutara su tarea hasta poder finalizarla. Incluso si el metodo main concluye, cada thread
 * es independiente del resto.
 *
 * En este ejemplo, creamos dos thread distintos que realizan un simple bucle y ambos daran como resultado, 1 millon. Tenemos esa certeza ya que cada thread
 * maneja sus propias variables e instancias de MyRunnable
 */
public class ThreadExample1 {

    public static void main(String[] args) {

        Runnable runnable1 = new MyRunnable();
        Runnable runnable2 = new MyRunnable();

        Thread thread1 = new Thread(runnable1, "Thread 1");
        Thread thread2 = new Thread(runnable2, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
