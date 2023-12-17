package thread.initialing;

/**
 * Tomando en cuenta que la interface runnable espera que la clase sobreescriba el metodo run, podemos usar una expresion lambda
 * para coincidir con la firma del metodo run y simplificarlo. Es mas, podriamos usar directamente una lambda cuando instanciamos la clase
 * thread.
 */
public class ThreadExample4 {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println(Thread.currentThread().getName() + " running");

        Thread thread = new Thread(runnable, "Thread");

        Thread thread1 = new Thread(
                () -> System.out.println(Thread.currentThread().getName() + " running"),
                "Thread"
        );

        thread.start();
    }

}
