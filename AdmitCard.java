import java.util.Scanner;

public class AdmitCard 
{
    public static void main() 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your class number: ");
        int classNum = input.nextInt();
        
        System.out.print("Enter your section: ");
        char section = input.next().charAt(0);
        
        input.nextLine(); 
        
        System.out.print("Enter the date : ");
        String Date = input.nextLine();
        
        System.out.print("Enter your roll number: ");
        double rollNo = input.nextDouble();
        
        System.out.println("==========================================");
        System.out.println("          JOHNSON GRAMMAR SCHOOL         ");
        System.out.println("               ADMIT CARD                 ");
        System.out.println("==========================================");
        System.out.printf("  Name:            %-20s  \n", name);
        System.out.printf("  Class:           %02d                  \n", classNum);
        System.out.printf("  Section:         %-20s \n", section);
        System.out.printf("  Date:            %-20s \n", Date);
        System.out.printf("  Roll No:         %012.0f          \n", rollNo);
        System.out.println("==========================================");
    }
}

