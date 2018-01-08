package COR_TAX_Chain;

/**
 * Created by wb-zh306310 on 2018/1/8.
 */
public class TaxHandlerFactory {

    public static void getTax(double wages) {
        TaxHandler firstOrderTaxHandler = new FirstOrderTaxHandler();
        TaxHandler secondOrderTaxHandler = new SecondOrderTaxHandler();
        TaxHandler thirdOrderTaxHandler = new ThirdOrderTaxHandler();
        TaxHandler fourthOrderTaxHandler = new FourthOrderTaxHandler();
        TaxHandler fifthOrderTaxHandler = new FifthOrderTaxHandler();
        TaxHandler sixthOrderTaxHandler = new SixthOrderTaxHandler();
        TaxHandler seventhOrderTaxHandler = new SeventhOrderTaxHandler();

        firstOrderTaxHandler.setSuccessor(secondOrderTaxHandler);
        secondOrderTaxHandler.setSuccessor(thirdOrderTaxHandler);
        thirdOrderTaxHandler.setSuccessor(fourthOrderTaxHandler);
        fourthOrderTaxHandler.setSuccessor(fifthOrderTaxHandler);
        fifthOrderTaxHandler.setSuccessor(sixthOrderTaxHandler);
        sixthOrderTaxHandler.setSuccessor(seventhOrderTaxHandler);

        firstOrderTaxHandler.TaxHandlerRequest(wages);
    }
}
