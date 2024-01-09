package thread.concurrency;

public class SynchronizedExchanger {

    private Object o = null;

    public synchronized void setObject(Object o) {
        this.o = o;
    }

    public synchronized Object getObject() {
        return this.o;
    }

    public void setO(Object o) {
        synchronized (this) {
            this.o = o;
        }
    }

    public Object getO() {
        synchronized (this) {
            return this.o;
        }
    }

}
