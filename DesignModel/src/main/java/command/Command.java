package command;

/**
 * 命令接口，所有具体的命令都会实现此接口，Invoker只认识此接口
 *
 * 其实现类包含了可以执行自己的对象（receiver），以及执行时候需要的数据
 */
public interface Command {
    void execute();
}
