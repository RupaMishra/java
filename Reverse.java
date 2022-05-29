import java.util.Scanner;
class Reverse{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of digits");
		int dig=sc.nextInt();
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		int new_number=number;
		
		int rem=0;
		int rev=0;
		
		for(int index=0;index<dig;index++){
			rem=number%10;
			rev=rev*10+rem;
			number/=10;
		}
		
		System.out.println("number is "+rev);
	
	}
}