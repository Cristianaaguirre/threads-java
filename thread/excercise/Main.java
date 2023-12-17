package thread.excercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {

        String[] nombres = {"Javier", "Andres", "Martin"};
        CarreraDeCaballos[] caballos = new CarreraDeCaballos[3];

        for (int i = 0; i < nombres.length; i++) {
            caballos[i] = new CarreraDeCaballos(nombres[i]);
        }

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (CarreraDeCaballos c : caballos) {
            executor.execute(c);
        }

        executor.shutdown();
    }




}
