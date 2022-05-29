import java.util.HashMap;
import java.util.*;

class CharacterCount {

    static void character(String A,String B){
        HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> charcount1 = new HashMap<Character, Integer>();
        char[] name = A.toCharArray();
        char[] name1 = B.toCharArray();
		
        for(char c : name){
            if(charcount.containsKey(c)){
                charcount.put(c,charcount.get(c)+1);
            }else{
                charcount.put(c,1);
            }
        }
		
        for (Map.Entry entry : charcount.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());             
        }
		
		Set<Character> key=charcount.keySet();
		String[] keyArr = new String[key.size()];
		key.toArray(keyArr);
		System.out.println(keyArr);
		
		for(char c1 : name1){
            if(charcount1.containsKey(c1)){
                charcount1.put(c1,charcount1.get(c1)+1);
            }else{
                charcount1.put(c1,1);
            }
        }
		
        for (Map.Entry entry1 : charcount1.entrySet()) {
			System.out.println(entry1.getKey() + " " + entry1.getValue());    
        }			
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String str="Kanak";
        String str1="Payal";
        String str2=str.toLowerCase();
        String str3=str1.toLowerCase();
        character(str2,str3);
		
    }
    
}
