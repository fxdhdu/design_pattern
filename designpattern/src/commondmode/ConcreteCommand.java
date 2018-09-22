package commondmode;

/**
 * 命令实体
 * Created by fxd on 2018/9/22.
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.action();
    }
}
