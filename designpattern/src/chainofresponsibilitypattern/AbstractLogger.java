package chainofresponsibilitypattern;

/**
 * Created by fxd on 2018/9/30.
 */
public abstract class AbstractLogger {
    /*3种日志级别*/
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    /*日志级别*/
    protected int level;

    /*责任链中下一个元素*/
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /*打印level级以下的所有日志*/
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (null != nextLogger) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
