package thread.initialing;


/**
 * Aunque el hilo de la clase main, quien es el que da inicio a la aplicacion sigue en pie, si otro hilo se encuentra en ejecucion
 * la JVM seguira manteniendo el programa.
 *
 * Para evitar este inconveniente podemos setear el proceso con el metodo setDaemon(true), esto permite que al finalizar el hilo de la clase
 * main, el resto de hilos terminen su ejecucion.
 */
public class ThreadExample6 {


    public static void main(String[] args) {

        Runnable runnable = () -> {
            while (true) {
                sleep(1000);
                System.out.println("Thread Running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        sleep(3000);

        System.out.println("Main thread finishing");
    }

    public static void sleep(long mili) {
        try {
            Thread.sleep(mili);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
