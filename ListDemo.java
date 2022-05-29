import java.io.*;
import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l=new ArrayList<Integer>(); 
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            l.add(element);
        }
		System.out.println("queries:");
        int q=sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<=q;i++){
			System.out.println("query"+i);
            String str = sc.nextLine();
            int x,y;
            if(str. compareToIgnoreCase("Insert")==0){
                x=sc.nextInt();
                y=sc.nextInt();sc.nextLine();
                l.add(x,y);
            }else if(str. compareToIgnoreCase("Delete")==0){
                String z=sc.nextLine();
                l.remove(Integer.parseInt(z));
            }
        }

        for(int s:l){  
            System.out.print(s+" ");  
        } 

    }
}

