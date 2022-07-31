/*
  
Given a string, return a string made of the first 2 chars (if present), however include 
first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"


ID : 21CE108
NAME : Kaumil patni

 */



import java.util.*;
 class code1 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
       char[] ch = str.toCharArray();


        if(ch[0] == 'o')
        {
            System.out.print(ch[0]);
        }
        if(ch[1] == 'z')
        {
            System.out.print(ch[1]);

        }
        System.out.println();
    }

}



