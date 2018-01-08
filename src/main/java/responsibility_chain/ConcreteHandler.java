package responsibility_chain;

/**
 * Created by wb-zh306310 on 2018/1/7.
 */
public class ConcreteHandler extends Handler {
    /**
     * �����������ô˷�����������
     */
    @Override
    public void handleRequest() {
        /**
         * �ж��Ƿ��к�̵����ζ���
         * ����У���ת���������̵����ζ���
         * û����������
         */
        if (getSuccessor() != null) {
            System.out.println("pass request");
            getSuccessor().handleRequest();
        } else {
            System.out.println("process request");
        }
    }
}
