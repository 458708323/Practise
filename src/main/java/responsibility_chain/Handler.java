package responsibility_chain;

/**
 * Created by wb-zh306310 on 2018/1/7.
 * �������߽�ɫ
 */
public abstract class Handler {
    /**
     * ���к�̵����ζ���
     */
    protected Handler successor;

    /**
     * ʾ�⴦������ķ�������Ȼ���ʾ�ⷽ��û�д������
     * ��ʵ���ǿ��Դ���ģ����ݾ���������ѡ���Ƿ񴫵ݲ���
     */
    public abstract void handleRequest();

    /**
     * ȡֵ����
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * ��ֵ���������ú�̵����ζ���
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
