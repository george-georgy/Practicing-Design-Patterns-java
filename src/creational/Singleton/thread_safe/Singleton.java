package creational.Singleton.thread_safe;

public final class Singleton {
    // volatile keyword guarantees variable visibility across threads, meaning reads and writes are visible across threads.
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {

        Singleton result = instance;
        if (result != null) {
            return result;
        }
        // synchronized only make one thread can access the resource at a given point in time.
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
