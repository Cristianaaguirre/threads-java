package thread.concurrency;

public class StaticSynchronizedExchanger {

    private static Object o = null;

    public static synchronized void setObject(Object o) {
        o = o;
    }

    public static synchronized Object getObject() {
        return o;
    }

    public static void setO(Object o) {
        synchronized (StaticSynchronizedExchanger.class) {
            o = o;
        }
    }

    public static Object getO() {
        synchronized (StaticSynchronizedExchanger.class) {
            return o;
        }
    }

}
