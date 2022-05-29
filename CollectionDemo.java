import java.util.*;
class ColeectionDemo{
	public static void main(String arg[]){
		ArrayList<String> str = new ArrayList<String>();
		str.add("Bengan");
		str.add("Adouri");
		str.add("Bhatta");
		str.add("Bhindi");
		for(String obj : str){
			System.out.println(obj);
		}
	}
}