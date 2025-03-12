package behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// subject(observable):object that we can observe.
public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer newObserver) {
        observers.add(newObserver);
    }
    public void removeObserver(Observer deletedObserver) {
        observers.remove(deletedObserver);
    }

    public void notifyObservers(int value) {

        for (var observer :observers)
         {
            observer.update(value);
         }
    }


}
