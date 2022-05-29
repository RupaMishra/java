interface HamraInterface{
	public String hehehe(String kuchhBhi);
}
class LambdaDemo{
	public static void main(String[] args){
		String name = "RUpaPaYAAl";
		HamraInterface obj = getObj();
		System.out.println(obj.hehehe(name));
	}
	public static HamraInterface getObj(){
		return (a)->"Hello "+a;
	}
}