package responsibility_chain;

/**
 * Created by wb-zh306310 on 2018/1/7.
 * 抽象处理者角色
 */
public abstract class Handler {
    /**
     * 持有后继的责任对象
     */
    protected Handler successor;

    /**
     * 示意处理请求的方法，虽然这个示意方法没有传入参数
     * 但实际是可以传入的，根据具体需求来选择是否传递参数
     */
    public abstract void handleRequest();

    /**
     * 取值方法
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * 赋值方法，设置后继的责任对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
