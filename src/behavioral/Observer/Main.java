package behavioral.Observer;

public class Main {
    public static void main(String[] args) {

        // observable
        var dataSource = new DataSource();

        // observers
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Chart();

        // add observers to the observable subject dataSource
        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        // all observers got notified after the following line
        dataSource.setValue(5);

    }
}
