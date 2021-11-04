package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int g = input.nextInt();  
    int[] array = new int[g];
    int min = 100;

    for(int i = 0; i < g; i ++)
    {
      array[i] = input.nextInt();
      if (min > array[i]) {
        min = array[i];
      }
    }
    System.out.println("Min index: " + min);

    
    
       
    }

}