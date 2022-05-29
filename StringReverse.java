class StringReverse{
	public static void main(String args[]){
	String s="i.likr.very.much.";
	String b;
	for(int i = s.length(); i>=0 ; i--){
		if(s.charAt(i)=='.'){
			System.out.print(s.charAt(i));
		}
		else{
			if(s.charAt(i)!='.'){
			while(s.charAt(i)!='.'){
				for(int j=0;j<s.length();j++){
					s.charAt(i)=b.charAt(j);
					String[] newWord = b.split("");
				}
			}
			}else{
				b=null;
			}
			for(int k=b.length();k>0;K--){
					System.out.print(newWord[k]);
				}
		}
	}
	}
}