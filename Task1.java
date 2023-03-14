public class Task1 
{
    private static double x;
    public static void main(String[] args)
    {
        double y1 = 0;
        x = -3;
        while(x <= 3)
        {
            y1 = Math.pow(x, 5) + 2*x;
            System.out.println("y1=" + y1 + " x= " + Math.round(x*100.0)/100.0);
            x += 0.3;
        }
        
    }
}
