package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int g = input.nextInt();
        int[] array = new int[g];

        for(int i = 0; i < g; i ++)
        {
          array[i] = input.nextInt();
        }
        for(int i = 0; i < array.length; i ++)
        {
          System.out.println();
          for(int a = 0; a < i; a ++)
          {
            System.out.print(" ");
          }
          System.out.print(array[i]);
        }
        
      
       
    }

}