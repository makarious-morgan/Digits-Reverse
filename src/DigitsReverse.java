import java.util.Scanner;

public class DigitsReverse
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int c=0 ;
        int r=i*(-1);
        while (i!=0)
        {
            i/=10;
            c++ ;
        }
        if (c==0)
        System.out.println("Number of digits is: "+1+" Reverse number is: 0 ");
        else
        {
            System.out.println("Number of digits is: " + c);
            System.out.println("Reverse number is: " + r);
        }
    }
}
