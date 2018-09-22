package commondmode;

/**
 * Created by fxd on 2018/9/22.
 */
public class Demo {

    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);

        Invoker i = new Invoker();

        i.setCommand(c);

        i.executeCommand();
    }
}
