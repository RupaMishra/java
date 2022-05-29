import java.util.*;
class Quad{
	public static void main(String arg[]){
		int x,y;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter X coordinate=");
		x= sc.nextInt();
		System.out.println();
		System.out.print("Enter Y coordinate=");
		y= sc.nextInt();
		if(x>0 && y>0){
			System.out.println("1st quadrant");
		}
		else if(x<0 && y>0){
			System.out.println("2nd quadrant");
		}
		else if(x<0 && y<0){
			System.out.println("3rd quadrant");
		}
		else if(x>0 && y<0){
			System.out.println("4th quadrant");
			
		}
		 
	}
}