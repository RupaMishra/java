import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if(A.compareTo(B)<=0){
            String A1=A.substring(0,1);
            A1=A1.toUpperCase();
            String A2=A.substring(1);

            String B1=B.substring(0,1);
            B1=B1.toUpperCase();
            String B2=B.substring(1);
            System.out.println(A1+A2+" "+B1+B2);
        }        
    }
}



