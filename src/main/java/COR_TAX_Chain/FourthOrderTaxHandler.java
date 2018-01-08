package COR_TAX_Chain;

/**
 * Created by wb-zh306310 on 2018/1/8.
 */
public class FourthOrderTaxHandler extends TaxHandler {
    @Override
    protected void TaxHandlerRequest(double wages) {
        if (12500 < wages && wages <= 38500) {
            double tax1 = 1500 * 0.03;
            double tax2 = 3000 * 0.1;
            double tax3 = 4500 * 0.2;
            double tax4 = (wages - 12500) * 0.25;
            double tax = tax1 + tax2 + tax3 + tax4;
            wages = wages - tax;
            System.out.println("本月工资" + wages + "元，交税" + tax + "元");
        } else {
            getSuccessor().TaxHandlerRequest(wages);
        }
    }
}
