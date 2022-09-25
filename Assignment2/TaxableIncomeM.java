public class TaxableIncomeM {
    public static double IncomeM(double s, double income) {
        double tax;
        if (s == 0) {
            if (income >= 0 && income <= 8000)
                tax = income * (10 / 100);
            else {
                if (income >= 8000 && income <= 32000)
                    tax = 800 + (income - 8000) * (15 / 100);
                else
                    tax = 4400 + (income - 16000) * (25 / 100);
            }
        }

        else
        {
            if(income>=0 && income <= 16000)
                tax = income * (10/100);
            else if (income>=16000 && income<=64000) {
                tax = 1600 + (income - 16000) * (15/100);

            }
            else
                tax = 8800 + (income - 64000) * (25/100);
        }
        return tax;

    }
}

