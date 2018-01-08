package COR_TAX_Chain;

/**
 * Created by wb-zh306310 on 2018/1/8.
 * 抽象处理者
 */
public abstract class TaxHandler {

    protected TaxHandler successor;

    protected TaxHandler getSuccessor() {
        return successor;
    }

    protected abstract void TaxHandlerRequest(double wages);

    protected void setSuccessor(TaxHandler successor) {
        this.successor = successor;
    }
}
