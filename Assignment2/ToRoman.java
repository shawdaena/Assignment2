import java.util.Scanner;

public class ToRoman {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = in.nextInt();
        Roman Num = new Roman();
        Num.RomanNum(num);


    }
}
