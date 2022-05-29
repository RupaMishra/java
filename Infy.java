import java.util.*;

class Infy{
	
	public static int[] getOccurence(int[] arr,int x){
		 int n = arr.length;
		  
		  Arrays.sort(arr);
		  
			int first = -1, last = -1;
			for (int i = 0; i < n; i++) {
				if (x != arr[i])
					continue;
				if (first == -1)
					first = i;
				last = i;
			}
			if (first != -1) {
				arr[0]=first;
				arr[1]=last;
			}
			else{
				System.out.println("Not Found");
			}
			return arr;
		 }
	
	public static void main(String[] args){
		int[] arr = {4,4,2,1};
		
		for(int x = 0; x < arr.length ; x++){
			int[] occur = getOccurence(arr,x);
			if(occur[0] == occur [1]){
				x=0;
				continue;
			}else{
				arr[occur[0]] = 0;
				arr[occur[1]] = x/2;
			}
		}
		
		for(int i = 0 ; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

}