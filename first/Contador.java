package first;

public class Contador implements Runnable{

    private int contador;
    private String nombre;
    private int limite;

    private Thread hilo = null;

    public Contador(String nombre, int limite) {
        this.contador = 0;
        this.nombre = nombre;
        this.limite = limite;

        hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < this.limite; i++) {
            System.out.println("Hilo " + this.nombre + ": " + i);
        }
        this.contador++;
    }

    public Thread getHilo() {
        return this.hilo;
    }
}
