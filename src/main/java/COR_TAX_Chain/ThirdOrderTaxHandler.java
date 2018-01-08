package COR_TAX_Chain;

/**
 * Created by wb-zh306310 on 2018/1/8.
 */
public class ThirdOrderTaxHandler extends TaxHandler {
    @Override
    protected void TaxHandlerRequest(double wages) {
        if (8000 < wages && wages <= 12500) {
            double tax1 = 1500 * 0.03;
            double tax2 = 3000 * 0.1;
            double tax3 = (wages - 8000) * 0.2;
            double tax = tax1 + tax2 + tax3;
            wages = wages - tax;
            System.out.println("本月工资" + wages + "元，交税" + tax + "元");
        } else {
            getSuccessor().TaxHandlerRequest(wages);
        }
    }
}
