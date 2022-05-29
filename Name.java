import java.util.Scanner;
class Name{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] str1 = str.split(" ");
		
		if(str1.length %2 == 0){
			
			for(int i=0;i<str1.length;i++){
				
				String temp=str1[i];
				str1[i]=str1[i+1];
				str1[i+1]=temp;
				
				i++;
			}
			
			
		}
		else{
			for(int i=0;i<str1.length-1;i++){
				
				String temp=str1[i];
				str1[i]=str1[i+1];
				str1[i+1]=temp;
				
				i++;
			}
		}
		
		for(int j=0;j<str1.length;j++){
				System.out.print(str1[j]+" ");
			}
		
	}
}