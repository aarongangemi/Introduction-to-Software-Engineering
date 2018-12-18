import java.util.Scanner;

/** Production code for ISE (ISAD1000) worksheet 6, part 1. */
public class Max
{   
    /** Inputs two integers from the user, and outputs the maximum. */     
    public static void max()
    {
        int num1, num2, maximum;
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        
        System.out.print("Enter second integer: " );
        num2 = input.nextInt();
        
        maximum = num1;
        if(num2 > num1)
        {
            maximum = num2;
        }
        
        System.out.println("The maximum is " + maximum);
    }
}
