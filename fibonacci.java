import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        System.out.println(" Enter a number :");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        int a=0;
        System.out.println(a);
        int b=1;
        System.out.println(b);
        int count = 2;

        while(count<=input)
        {
            int temp = b;
            b=a+b;
            a=temp;
            count++;
            System.out.println(b);
        }
       // System.out.println(a);
    }
}
