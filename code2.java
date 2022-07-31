/*
  
Given an array of ints, return true if the sequence of numbers 1, 
2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true


ID : 21CE108
NAME : Kaumil patni

 */
import java.util.*;
public class code2 {
    public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 int a,b;
 a=sc.nextInt();
 b=sc.nextInt();
 int p;
 p=b%10;
 if(a==p)
 {
 System.out.println("true");
 }
 else
 {
 System.out.println("false");
 }
 }

}
