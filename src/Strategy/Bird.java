package Strategy;

// client
public class Bird extends Animal{


    public Bird(){
        super();
        setSound("Tweet");
        flyingType = new ItFlays();
    }

}
