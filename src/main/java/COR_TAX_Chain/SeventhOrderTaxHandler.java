package COR_TAX_Chain;

/**
 * Created by wb-zh306310 on 2018/1/8.
 */
public class SeventhOrderTaxHandler extends TaxHandler {
    @Override
    protected void TaxHandlerRequest(double wages) {
        double tax1 = 1500 * 0.03;
        double tax2 = 3000 * 0.1;
        double tax3 = 4500 * 0.2;
        double tax4 = 26000 * 0.25;
        double tax5 = 20000 * 0.3;
        double tax6 = 25000 * 0.35;
        double tax7 = (wages - 83500) * 0.45;
        double tax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6 + tax7;
        wages = wages - tax;
        System.out.println("本月工资" + wages + "元，交税" + tax + "元");
    }
}
