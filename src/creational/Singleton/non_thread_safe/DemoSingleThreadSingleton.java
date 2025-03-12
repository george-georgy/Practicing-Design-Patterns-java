package creational.Singleton.non_thread_safe;

public class DemoSingleThreadSingleton {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (Meow!)" + "\n" +
                "If you see different values, then 2 singletons were created (bark!)" + "\n\n" +
                "RESULT:" + "\n");

        Singleton singleton = Singleton.getInstance("Meow");
        Singleton anotherSingleton = Singleton.getInstance("bark");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }


}
