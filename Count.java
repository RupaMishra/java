import java.util.*;

class Count{
   
   public static void main(String[] args) {
     // write your code here 
 
		Scanner sc = new Scanner(System.in);
		
		int dig=0;
		
		int number=sc.nextInt();
		int rem=0;
		int num=number;
		while(num!=0){
		 	rem=num%10;
            dig++;
			num/=10; 
		}
		System.out.println(dig);

    }
   }