// A program to count the occurrences of a digit in a number.

import java.util.Scanner;

public class occurrences {
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        System.out.println("Enter the digit whose occurrence has to be counted: ");
        int a = s.nextInt();

        int count = 0;
        while(input > 0 )
        {
            if(input%10 == a)
            {
                count++;
            }
            input= input/10;
        }
        System.out.println("The number of occurrences is: "+ count);
    }
}
