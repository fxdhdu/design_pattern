package commondmode;

/**
 * 执行命令的对象
 * Created by fxd on 2018/9/22.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
