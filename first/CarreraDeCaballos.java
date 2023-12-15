package first;

public class CarreraDeCaballos implements Runnable{

    private String nombre;
    private int distancia;
    private Thread thread = null;
    private static int posicionActual = 0;

    public CarreraDeCaballos (String nombre) {
        this.nombre = nombre;

        thread = new Thread(this);
    }

    @Override
    public void run() {
        try {

            distancia = 0;

            while (distancia < 100) {

                Thread.sleep(1000);

                distancia += metrosPorPasos();

                System.out.println("El caballo: " + this.nombre + " lleva acumulados " + distancia + " metros de distancia");
            }

            int posicion = CarreraDeCaballos.posicionCarrera();
            System.out.println("El caballo " + this.nombre + " a cruzado la meta y es quedo " + posicion);

        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public static int posicionCarrera() {
        return ++posicionActual;
    }

    public int metrosPorPasos() {
        return (int) Math.floor(Math.random() * (10 + 1 - 1) + 1);
    }


}
