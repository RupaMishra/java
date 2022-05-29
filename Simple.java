
class Simple{
	
	static int a=9;
	
	Simple(int a){
		this.a=a;
	}
	
	public static void main(String[] args){
		
		Simple o1 = new Simple(4);
		System.out.println(o1.a);
		Simple o2 = new Simple(5);
		
		System.out.println(o1.a);
		System.out.println(o2.a);
		
	}
	
}
