import java.io.*;
import java.util.*;

public class TokenDemo{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count=0;
        int sum=0;
        int n =sc.nextInt();
        int[] arr=new int[n]; 
        for(int i=0;i<arr.length;i++){
            int m=sc.nextInt();
            arr[i]=m;
        }
        for(int j=0;j<arr.length;j++){
            for(int k=j;k<n;k++){
                if(j==k){
                    sum=arr[j];
                }else{
                    sum=arr[j]+arr[k];
                }if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

