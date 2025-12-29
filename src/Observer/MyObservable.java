package Observer;

import java.util.ArrayList;

public abstract class MyObservable implements MyObserver{

    ArrayList<MyObserver> observers = new ArrayList<>();

    public void attachUsers(MyObserver observer)
    {
        observers.add(observer);
    }

    public void warnUsers()
    {
        for(MyObserver observer : observers)
        {
            observer.warn();
        }
    }
}
