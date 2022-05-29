class SubString{
	public static void main(String args[]){
		String str1="photograph";
		String str2="tomography";
		
		for(int i=0;i<10;i++){
			char c1 = str1.toChar();
			char c2 = str2.toChar();
			if(c1.contains(c2)){
				System.out.println(c2);
			}
		}
	}
}