package Strategy;

// context
public class Animal {

    private String name;
    private double height;
    private int weight;
    private String sound;

    // The behavior is not tied to the superclass or subclasses
    public Flys flyingType;

    public void setSound(String sound) {
        this.sound = sound;
    }

    /*
     - we need to encapsulate what varies ,not every animal is flaying
     - do not do it.
    public void fly(){
        System.out.println("I'm flying");
    }
     */

    public String getFlyAbility(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }
}
