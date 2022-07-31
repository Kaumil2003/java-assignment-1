/*
  
Implement Caesar Cipher.


ID : 21CE108
NAME : Kaumil patni

 */
import java.util.*;
public class code9 
{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
   public static String encrypt(String plainText, int move) 
   
   {
      plainText = plainText.toLowerCase();
        String cipher = "";
                for (int i = 0; i < plainText.length(); i++) 
                {
                    int charPosition = ALPHABET.indexOf(plainText.charAt(i));
                    int keyVal = (move + charPosition) % 26;
                    char replaceVal = ALPHABET.charAt(keyVal);
                    cipher += replaceVal;
                }
        return cipher;
    }
    public static void main(String[] args)          
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String which you want to Encrypt: ");
        String message = new String();
            message = sc.next();
        System.out.println("After encyption:" + encrypt(message, 2));
}

}
