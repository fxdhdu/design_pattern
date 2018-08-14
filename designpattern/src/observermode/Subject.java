package observermode;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 * 抽象通知者
 * Created by fxd on 2018/8/14.
 */
public abstract class Subject {

    /**观察者对象的引用*/
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }


    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
