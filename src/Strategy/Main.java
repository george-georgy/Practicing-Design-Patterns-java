package Strategy;



public class Main {
    public static void main(String[] args) {

        Animal toby = new Dog();

        Animal owl = new Bird();

        System.out.println("Strategy.Dog: " + toby.getFlyAbility());
        System.out.println("Strategy.Bird: " + owl.getFlyAbility());

        toby.setFlyingAbility(new ItFlays());  // silly

        System.out.println("Strategy.Dog: " + toby.getFlyAbility());

    }
}
