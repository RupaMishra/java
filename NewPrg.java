import java.util.Scanner;
class NewPrg  
{    
	public static void main(String args[])   
	{    
		int i, j;     
				
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		for(int n=0;n<input1;n++){
			
			int row = sc.nextInt();
			
			for (i=0; i<row; i++)   
			{  
				int alphabet=65+i;
				for (j=2*(row-i); j>=0; j--){  
					System.out.print(" ");   
				}   
				for (j=0; j<=i; j++ ){   
					System.out.print((char) (alphabet)+" "); 
					alphabet++;
				} 
				for(int k=j;k<(2*j);k++){
					System.out.print(k);
				}
	  
			System.out.println();   
			}  
				
				
			}
		 
	}   
}  