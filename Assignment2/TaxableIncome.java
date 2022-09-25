import java.util.Scanner;

public class TaxableIncome {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //public double income ;
        System.out.println("Enter the income: ");
        double income = in.nextDouble();
        System.out.println("If you are Single enter 0 or enter 1");
        double s = in.nextDouble();

        TaxableIncomeM tx = new TaxableIncomeM();
        double Tax = tx.IncomeM(s,income);

        System.out.println("Total Tax: " +Tax);
    }
}
