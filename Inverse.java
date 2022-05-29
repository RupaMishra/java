import java.util.Scanner;
import java.lang.Math;

class Inverse{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of digits");
		int dig=sc.nextInt();
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		int rem=0;
		double finalNumber=0;
		
		for(int index=1;index<=dig;index++){
			rem=number%10;
			finalNumber=finalNumber+(index*(Math.pow(10,rem-1)));
			number/=10;
			
		}
		int new_number=(int)Math.round(finalNumber);
		System.out.println("final number is "+new_number);
		
	}

}