import java.util.Scanner;


		System.out.println("----------Task 1----------");
		System.out.println("----------Palindrom----------");

class Level{
	String palindrom(String str){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Input");
		str=sc.nextLine();
		int l=str.length();
		int n=str.length();
		char rev;
		for(int i=0;i<l;i++){
			rev(i)=str.charAt(n-1);
			str=str.subString(0,n-1);
			n--;
		}
		
		return (str+" is palindrom");
	}
	public static void main(String arr[]){
		Scanner sc=new Scanner(System.in);
		int choice;
		Level o = new Level();
		
		do{
			System.out.println("Enter 1 for Palindrom");
			
			choice=sc.nextInt();
			switch(choice){
				case 1:
					String str = sc.nextLine();
					System.out.println(o.palindrom(str));
					break;
			}
		}
		while(choice>0 && choice<8);

	}
}