import java.util.Scanner;
class Subtract{
	
	public int sub(int x){
		//subracting 2 numbers and return the intiger value as the return type is int
		
		return (x*x);
	}
	
	public static void main(String args[]){
		//object of the class
		Subtract s = new Subtract();
		int a=10 , b=5;
		//the value returned by the class is stored in c
		int c = s.sub(a);
		
		//printing the output value
		System.out.println("are of square with side "+a+" is = "+c);
	}
}