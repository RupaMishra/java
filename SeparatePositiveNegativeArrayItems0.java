public class SeparatePositiveNegativeArrayItems0 {
	
	
	public static int[] arraycopy(int[] count_PosNegArr){
		int i=0;
		int pos_count = 0, neg_count = 0;
		int arrlength = count_PosNegArr.length;
		
		int[] pos_Arr = new int[arrlength];
		int[] neg_Arr = new int[arrlength];
		
		while(i < arrlength) 
		{
			if(count_PosNegArr[i] >= 0) {
				pos_Arr[pos_count] = count_PosNegArr[i];
				pos_count++;
			}
			else {
				neg_Arr[neg_count] = count_PosNegArr[i];
				neg_count++;
			}
			i++;
		}
		int[] result = new int[arrlength];
		
		System.arraycopy(pos_Arr, 0, result, neg_count, pos_count);  
		System.arraycopy(neg_Arr, 0, result, 0, neg_count);  
		
		
		return result;
	
	}
	
	public static void main(String[] args) {
		
		int i = 0 ;
		int[] count_PosNegArr = {1,-1,6,-5,4};
		
		int[] res = arraycopy(count_PosNegArr);
		
		for(i = 0; i < res.length; i++) 
		{
			System.out.println(res[i]);
		}
		
	}
}