package chainofresponsibilitypattern;

/**
 * Created by fxd on 2018/9/30.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }


    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
