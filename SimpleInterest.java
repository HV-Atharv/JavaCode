public class SimpleInterest 
{
    public static void main() 
    {
        int p = 1500;
        int r = 30;
        int t = 20;
        
        double si = (p * r * t) / 100.0;
        
        double a = p + si;
        
        System.out.println("Principle: " + p);
        System.out.println("Rate of Interest: " + r + "%");
        System.out.println("Time Period: " + t + " years");
        System.out.println("Simple Interest: " + si);
        System.out.println("Amount: " + a);
    }
}
