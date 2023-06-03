package Observer;
// SpreadSheet is concrete observer need to observe on dataSource
public class SpreadSheet implements Observer{
    @Override
    public void update(int value) {
        System.out.println("SpreadSheet got notified " + value);

    }
}
