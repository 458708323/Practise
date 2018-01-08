package COR_TAX_Chain;

/**
 * Created by wb-zh306310 on 2018/1/8.
 */
public class FifthOrderTaxHandler extends TaxHandler {
    @Override
    protected void TaxHandlerRequest(double wages) {
        if (38500 < wages && wages <= 58500) {
            double tax1 = 1500 * 0.03;
            double tax2 = 3000 * 0.1;
            double tax3 = 4500 * 0.2;
            double tax4 = 26000 * 0.25;
            double tax5 = (wages - 38500) * 0.3;
            double tax = tax1 + tax2 + tax3 + tax4 + tax5;
            wages = wages - tax;
            System.out.println("本月工资" + wages + "元，交税" + tax + "元");
        } else {
            getSuccessor().TaxHandlerRequest(wages);
        }
    }
}
