class Largest{
	public static void main(String[] arr){
		int n1=146;
		int n2=4;
		int args=n1.split();
		for(int i=0;i<args.length;i++){
			if(args[i]==n2){	
				args[i]=n2-1;
				args[i+1]=9;
			}
			System.out.println(args[i]);
		}
		}
	}
