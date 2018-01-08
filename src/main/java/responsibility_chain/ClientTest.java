package responsibility_chain;

/**
 * Created by wb-zh306310 on 2018/1/7.
 */
public class ClientTest {
    public static void main(String[] args) {
        //��װ������
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //�ύ����
        handler1.handleRequest();
    }
}
