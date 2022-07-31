/*
  
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the 
array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true


ID : 21CE108
NAME : Kaumil patni

 */
import java.util.*;
public class code3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean flag = true;
        int[] arr = new int[100];
        System.out.println("Enter Size of the array : ");
        num = sc.nextInt();
        System.out.println("Enter the elements array");
        for (int i = 0; i < num; i++) {
        arr[i] = sc.nextInt();
        }
         for (int j = 0; j < num - 2; j++) 
        {
               if (arr[j] == 1) 
                {
                    if (arr[j + 1] == 2) 
                    {
                                 if (arr[j + 2] == 3)
                                {
                                    flag = false;
                                }
                    }
                }
        }
               
        if (flag == false) 
        {
                System.out.println("TRUE");
        } 
        else 
        {
                System.out.println("FALSE");
        }
    }
                        
}
