import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an operator: ");
        //Take input from user until they press x or X.
        while(true)
        {
            int ans =0;
            int op = s.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%')
            {
                System.out.println("Enter the first number:");
                int i1 = s.nextInt();
                System.out.println("Enter the second number:");
                int i2 = s.nextInt();
                if(op == '+')
                {
                     ans = i1 + i2;
                }
                if(op == '-')
                {
                     ans = i1 - i2;
                }
                if(op == '*')
                {
                     ans = i1 * i2;
                }
                if(op == '/')
                {
                    if(i2!= 0) {
                         ans = i1 / i2;
                    }
                }
                if(op == '%')
                {
                    ans = i1 % i2;
                }
                System.out.println(ans);
            }
            else if(op == 'x' || op == 'X')
            {
                System.exit(0);
            }
            else {
                System.out.println("Invalid operator");
            }
        }

    }
}
