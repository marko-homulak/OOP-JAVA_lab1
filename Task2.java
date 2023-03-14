public class Task2 {
   private static double x;
   public static void main(String[] args)
   {
      double y1 = 0;
      x = 0;
      while(x <= 4)
      {
         if(x < 3) y1 = Math.tan(x + 2);
         else y1 = Math.atan(x + 2);
         System.out.println("y1=" + y1 + " x=" + x + "\n");
         x += 1;
      }
      
   }
}
