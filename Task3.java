import java.util.Random;

public class Task3 {
   public static void main(String[] args)
   {
      int[][] A = new int[10][10];
      Random random = new Random();

      for(int i = 0; i < A.length; i++)
      {
         for(int j = 0; j < A[i].length; j++)
         {
            A[i][j] = (int) Math.round((random.nextDouble() * 20.0) - 10.0);
         }
      }

      for(int i = 0; i < A.length; i++)
      {
         for(int j = 0; j < A[i].length; j++)
         {
            System.out.println(A[i][j] + "\t");
         }
         System.out.println();
      }

      double sum = 0;
      int count = 0;

      for(int i = 0; i < A.length; i++)
      {
         for(int j = 0; j < A[i].length; j++)
         {
            if(i < j)
            {
               if(A[i][j] > 0)
               {
                  sum += A[i][j];
                  count++;
               }
            }
         }
      }

      double average = sum / count;

      System.out.println("Average of additional elements above auxiliary diagonal= " + average);
   
   }
}
