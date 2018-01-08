package responsibility_chain;

/**
 * Created by wb-zh306310 on 2018/1/7.
 */
public class ConcreteHandler extends Handler {
    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest() {
        /**
         * 判断是否有后继的责任对象
         * 如果有，就转发请求给后继的责任对象
         * 没有则处理请求
         */
        if (getSuccessor() != null) {
            System.out.println("pass request");
            getSuccessor().handleRequest();
        } else {
            System.out.println("process request");
        }
    }
}
