import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        boolean y = false;

        if(year % 4 == 0)
        {
            y = true;
        }
        else if (year % 100 == 0)
        {
            y = false;
        }
        else if (year % 400 == 0)
        {
            y = true;
        }
        else
            y = false;

        if(y)
        {
            System.out.println("Year " +year+" is a Leap Year");
        }

        else
            System.out.println("Year " +year+" is not Leap Year");
    }
}
