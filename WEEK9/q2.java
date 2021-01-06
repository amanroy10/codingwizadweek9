package WEEK9;
import java.util.*;
public class q2{  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,sbstr;
        
        System.out.println("Enter the first String : ");
        str = sc.nextLine();
        
        System.out.println("Enter the second String : ");
        sbstr = sc.nextLine();
        
        char [] c1str = str.toCharArray();
        char [] c2sbstr = sbstr.toCharArray();
       
        
            for(int j=0;j<c2sbstr.length;j++) {
                for(int i=0;i<c1str.length;i++) {

                if(c1str[i] == c2sbstr[j]) {
                    c1str[i] = 0;
                }    
            }
        }

        System.out.println("After removing the characters of second string from first string :");

        for(int i=0;i<c1str.length;i++) {
            System.out.print(c1str[i]); 
        }}}