import java.util.Scanner;
public class Var1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Entering the elements in an araay:\n");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
		int min=a[0];
        System.out.println("Displaying the array:\n");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
             if(a[i]<min){
                 min=a[i];                 
        }
        }
        System.out.println();
        System.out.println("The smallest element in ana array:"+min);
       }
    }