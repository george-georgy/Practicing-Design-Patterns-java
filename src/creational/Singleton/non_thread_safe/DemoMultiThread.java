package creational.Singleton.non_thread_safe;

public final class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (Meow!)" + "\n" +
                "If you see different values, then 2 singletons were created (bark!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadMeow = new Thread(new ThreadMeow());
        Thread threadBark = new Thread(new ThreadBark());
        threadMeow.start();
        threadBark.start();
    }

    static class ThreadMeow implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Meow");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBark implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
