import java.util.Scanner;
import  java.lang.Math;

class AllPrime{

		public static void main(String [] args){
			
			Scanner sc=new Scanner(System.in);
			int limit = sc.nextInt();
			boolean[] arr= new boolean[limit+1];
			
			for(int index=2;index<limit;index++){
				arr[index]=true;
			}
			
			for(int num=2;num<=Math.sqrt(limit);num++){
				if(arr[num]){
					for(int innerIndex=num*num;innerIndex<=limit;innerIndex+=num){
						if(innerIndex%num==0){
							arr[innerIndex]=false;
						}
					}
				}
				
			}
			
			for(int index=2;index<=limit;index++){
				if(arr[index]){
					System.out.println(index);
				}
			}

		}
	
}