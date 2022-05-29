import java.util.Scanner;
import  java.lang.Math;

class IsPrime{

		boolean checkPrime(int num){
			boolean flag=false;
			
			int isPrime = 1;
			for(int index=2; index<=Math.sqrt(num); index++)
			{
				if(num%index==0)
				{
					isPrime = 0;
					break;
				}
				
			}
			
			if(isPrime==1){
				flag=true;
			}
			else{
				flag=false;
			}
				
			return flag;
		}
		
		public static void main(String [] args){
			IsPrime object = new IsPrime();
			
			Scanner sc=new Scanner(System.in);
			int number = sc.nextInt();
			
			boolean isPrime = object.checkPrime(number);
			System.out.print(number+" is ");
			
			if(isPrime){
				System.out.print("prime");
			}
			else{
				System.out.print("not prime");
			}
			
		}
	
}