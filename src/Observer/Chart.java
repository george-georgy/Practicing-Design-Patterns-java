package Observer;

// Chart is concrete observer need to observe on dataSource
public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart got updated " + value);
    }
}
