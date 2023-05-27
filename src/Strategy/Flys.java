package Strategy;

// strategy
public interface Flys {
    String fly();
}

// concrete strategy
class ItFlays implements Flys{
    @Override
    public String fly() {
        return "Flying High";
    }
}

// concrete strategy
class CantFly implements Flys{
    @Override
    public String fly() {
        return "I can't fly";
    }
}


