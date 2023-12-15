package first;

public class HiloLetraNumero implements Runnable{

    private int tipo;
    private Thread hilo = null;

    public HiloLetraNumero(int tipo, String name) {
        this.tipo = tipo;
        hilo = new Thread(this, name);
        hilo.start();
    }

    @Override
    public void run() {

        if (tipo == 1) {
            for (int i = 0; i < 30; i++)
                System.out.println(hilo.getName() + i);
        } else {
            for (char c = 'a'; c < 'z'; c++)
                System.out.println(hilo.getName() + c);
        }

    }
}
