//Task 3
import java.util.Random;
public class MathWork 
{
      public static void main(String args[]) 
      {
      
            Random rd = new Random();

            int[] random = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10};
       
            for (int i=1; i<100; i++) 
            {
            if (i%3==0) 
            System.out.print(i +", ");      
            }
      
            int randomNumber = rd. nextInt(random.length);
            System.out.println("*******");
            System.out.println(random[randomNumber]);
            
            recurce(10);
      }

      public static void recurce(int n)
      {
            System.out.println(n);
            int new_n = n-1;

            if(new_n > 0)
            {
                  
                  recurce(new_n);
            } 
      }
}






