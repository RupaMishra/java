import java.util.Scanner;

class GcdLcm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int first_number=sc.nextInt();
		int second_number=sc.nextInt();
		
		int num,dev;
		if(first_number>second_number){
			num=first_number;
			dev=second_number;
		}else{
			num=second_number;
			dev=second_number;
		}
		
		int rem=num%dev;
		
		do{
			num=dev;
			dev=rem;
			rem=num%dev;
		}
		while(rem!=0);
		
		int gcd=dev;
		int lcm=first_number*second_number/gcd;
		
		System.out.println("GCD of two number is "+gcd);
		System.out.println("LCM of two number is "+lcm);
	}
}