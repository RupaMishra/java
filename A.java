import java.util.*;
class A{
	public static void main(String[] args){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(10);
		list.add(10);
		list.add(1);
		
		List<Integer> result = occur(list);
		
		System.out.println("final ");
		for(int i =0 ; i<result.size();i++){
			System.out.println(result.get(i));
		}
		
	}
	
	public static List<Integer> occur(List<Integer> list){
		for(int i =0 ; i<list.size();i++){
			int value = list.get(i);
			int first = list.indexOf(value);
			int last = list.lastIndexOf(value);
			
			System.out.println("first"+first+" last"+last);
			
			if(first!=last){
				list.set(last,(value/2));
				list.remove(first);
			}
			System.out.println("itration "+i);
			for(int j =0 ; j<list.size();j++){
				System.out.println(list.get(j));
			}
		}
		return list;
	}
}