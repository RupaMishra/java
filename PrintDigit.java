import java.util.*;

class PrintDigit{
   
   public static void main(String[] args) {
     // write your code here 
 
		Scanner sc = new Scanner(System.in);
		int dig=0;
		long number=sc.nextInt();
		long rem=0;
		long rev=0;
		long num=number;
		while(num!=0){
		 	rem=num%10;
            rev=rev*10+rem;
            dig++;
			num/=10;
		}
		for(int index=0;index<dig;index++){
		 	rem=rev%10;
            System.out.println(rem);
			rev/=10;
		}
    }
 }