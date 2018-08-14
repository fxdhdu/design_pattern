package observermode;

/**
 * Created by fxd on 2018/8/14.
 */
public class ObserverModeDemo {

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("X", s));
        s.attach(new ConcreteObserver("Y", s));
        s.attach(new ConcreteObserver("Z", s));

        /*主题状态的改变，需用通知到所有的观察者*/
        s.setSubjectState("ABX");
        s.notifyObservers();
    }

}
