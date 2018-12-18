import java.util.Scanner;
public class Max
{
/** Inputs two integers from the user, and outputs the
 * maximum. */
  public static void max()
  {
    int num1, num2, maximum;
    Scanner input = new Scanner(System.in);
    String x;
    x = localise("Enter 1st Integer: ", English, French);
    System.out.print(x)
    num1 = input.nextInt();
    System.out.print(localise("Enter 2nd integer: ", English, French));
    num2 = input.nextInt();
    maximum = num1;
    if(num2 > num1)
    {
      maximum = num2;
    }
    System.out.println(localise("The maximum is " + maximum, English, French);
  }
}
