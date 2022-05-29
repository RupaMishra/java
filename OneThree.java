import java.util.Scanner;

class OneThree{
	
	public static void main(String str[]){

		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		for(int i=0;i<input1;i++){
			int input2=sc.nextInt();
			int ch=65;
			for(int j=0;j<input2;j++){
				for (int c=2*(input2-i); c>=0; c--){  
					System.out.print(" ");   
				}   
				for (int c1=0; c1<=i; c1++ ){   
					System.out.print((char) (ch)+" "); 
					ch++;
				} 
				
					
				for(int k=j;k<(2*j);k++){
					System.out.print(k);
				}
				System.out.println("");
			}
		}	
	}
}