public class TimeConverter 
{
    public static void main() 
    {
        int timeInSec = 128;
        
        int hours = timeInSec / 3600;
        timeInSec = timeInSec % 3600;

        int minutes = timeInSec / 60;
        timeInSec = timeInSec % 60;

        int seconds = timeInSec;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}
