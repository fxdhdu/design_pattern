package commondmode;

/**
 * Created by fxd on 2018/9/22.
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract void execute();
}
