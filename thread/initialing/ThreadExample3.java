package thread.initialing;

/**
 * Tambien podemos evitar la creacion de clases y simplemente crear una clase anonima a travez de la interface Runnable,
 * donde posteriormente sobreescribimos el metodo run()
 */
public class ThreadExample3{

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " running");
            }
        };


        Thread thread = new Thread(runnable, "Thread");
        thread.start();

    }


}
