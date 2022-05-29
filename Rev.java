import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Rev{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        char[] ch=s.toCharArray();
		int count=1;
		int l = ch.length;
		boolean flag = false;
		StringBuilder builder = new StringBuilder();
		if(ch.length==0){
			return;
		}
		for(int i=0;i<l-1;i++){
			if((ch[i]==' ')||(ch[i]=='?')||(ch[i]==',')||(ch[i]=='.')||(ch[i]=='-')||(ch[i]=='\'')){
				if(flag){
					count++;
					System.out.println("index : "+i+" char: "+ch[i]+" pc: "+count);
					builder.append("\n");
				}
				flag = false;
				continue;
			}else{
				flag = true;
				builder.append(ch[i]);
			}
		}
		System.out.println(count);
		System.out.println(builder.toString());
        scan.close();
	}
}