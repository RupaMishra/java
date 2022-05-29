class Pattern1{
	public static void main(String[] args){
		
		int x=1;
		int n=5;
		
		for(int i=1;i<=2*n;i++){
			if(i<=n){
				x+=1;
			}else{
				x-=1;
			}
			int space=5-x;
			for(int j=0;j<=space;j++){
				System.out.print(" ");
			}
				for(int k=0;k<2*(x-1);k++){
					System.out.print("*");
				}
			System.out.println("");
		}
		
	}//bluej
}