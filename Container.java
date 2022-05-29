import java.util.Scanner;
class Container {
    public static int maxArea(int[] height) {
        
        int length = 0;
        int width = 0;
        int capacity = 0;
        int max = 0;
		int idx=0;
		int innerIdx=height.length-1;
		
		while(idx<innerIdx){
			if(height[innerIdx] > height[idx]){
				length = height[idx];
			}
			else{
				length = height[innerIdx];
			}
			
			width = innerIdx-idx;
			
			System.out.println("length "+ length);
			System.out.println("width "+width);
			
			capacity = length*width;
			System.out.println("capacity "+capacity);
			if(capacity > max){
				max = capacity;
			}
			
			if(height[idx] < height[innerIdx]){
				idx++;
			}
			else{
				innerIdx--;
			}
			
			System.out.println("max"+max);
			
			
		}
		
        return max;
    }
	
	public static void main(String [] str){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for(int idx = 0 ; idx < len ; idx++){
			
			arr[idx]= sc.nextInt();
			
		}
		
		int result = maxArea(arr);
		System.out.println("result "+result);
		
	}
}