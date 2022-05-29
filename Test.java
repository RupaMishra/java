class A{
	
	
	void run(){
			System.out.println("run...");
		}
	interface B{
		void eat();
	}
	
}

class C extends A implements A.B{
	public void eat(){
		System.out.println("eat...");
	}
}

class Test{
	public static void main(String[] args){

	}
}