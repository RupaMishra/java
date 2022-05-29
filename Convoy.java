class Convoy{
	public static void main(String[] args){
	
		int[] arr2 = {1,2,3};
		int count = 0;
		int currMin = arr2[0];
		StringBuffer buff = new StringBuffer();
		
		for(int i=0;i<arr2.length;i++){
			if(currMin<=arr2[i]){
				count++;
				if(i==(arr2.length-1)){
					buff.append(count+"");
				}
			}else{
				buff.append(count+",");
				currMin = arr2[i];
				count = 1;
				if(i==(arr2.length-1)){
					buff.append(count+" ");
				}
			}
		}
		System.out.println(buff.toString());
	}
}

plot no 156 kh.no. 733 1st floor Sharadhanand colony park blk-f,swami sharadhanand colony, village bhalswa ,dairy landmark