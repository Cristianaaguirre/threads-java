package thread.java.memory.model;

import java.awt.*;

/**
 * El problema es que en muchas ocasiones podemos tener diferentes threads trabajando con las mismas referencias lo que puede llevar a grandes problemas.
 *
 * En este caso tenemos dos threads trabajando con la misma instancia de MyRunnable, esto provoca que al ejecutarlos trabajen con las mismas propiedades y los bucles
 * se superpongan. A esto se le llama condicion de carrera, los threads no estan sincronizados y trabajan sin orden alguno.
 *
 * Es importante poder menjar estas condiciones para poder asegurar que la informacion compartida entre los threads no se superponga.
 */
public class ThreadExample2 {

    public static void main(String[] args) {

        Runnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");

        thread1.start();
        thread2.start();
    }

}
