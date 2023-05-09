import java.util.Scanner;

public class ExpressionValue 
{
    public static void main() 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();

        double s = a * x * x + b * x + c;
        System.out.println("The value of the expression is: " + s);
    }
}
