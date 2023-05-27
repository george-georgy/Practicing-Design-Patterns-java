package Strategy;

// client
public class Dog extends Animal{

    public void digHole(){
        System.out.println("Dug a hole");
    }

    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CantFly();
    }

    /*
     do not do the following
    @Override
    public void fly(){
        System.out.println("cannot fly");
    }
     */
}
