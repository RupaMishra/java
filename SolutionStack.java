import java.util.*;
import java.io.*;
class SolutionStack{
	
	public static void main(String []argh) throws FileNotFoundException
	{
		File file = new File("stack_pro.txt");
		Scanner sc = new Scanner(file);
		Map<Character,Character> map = new HashMap<>();
		map.put('{','}');
		map.put('[',']');
		map.put('(',')');
		LOOP1:
		while (sc.hasNext()) {
			String input=sc.next();
			//System.out.println(input);
            //Complete the code
			//
            char[] arr = input.toCharArray();
            
            Stack<Character> stack = new Stack<Character>();
            for(int i=0;i<arr.length;i++){
                char c = arr[i];
				if(c == '}' || c == ']' || c == ')'){
					if(stack.isEmpty()){
						System.out.println(false);
						continue LOOP1;
					}
					char c2 = stack.pop();
					if(map.get(c2) != c){
						System.out.println(false);
						continue LOOP1;	
					}
				}else{
					stack.push(c);
				}
				
            }
            System.out.println(stack.isEmpty());
		
		}
		
	}
}



