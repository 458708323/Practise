package COR_TAX_Chain;

/**
 * Created by wb-zh306310 on 2018/1/8.
 */
public class FirstOrderTaxHandler extends TaxHandler {
    @Override
    protected void TaxHandlerRequest(double wages) {
        if (wages <= 3500) {
            System.out.println("���¹���" + wages + "Ԫ����˰0Ԫ");
        } else if (3500 < wages && wages <= 5000) {
            double tax = (wages - 1500) * 0.03;
            wages = wages - tax;
            System.out.println("���¹���" + wages + "Ԫ����˰" + tax + "Ԫ");
        } else {
            getSuccessor().TaxHandlerRequest(wages);
        }
    }
}
