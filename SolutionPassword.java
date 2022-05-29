import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(String password) {
        int count=0;
		char[] ch = password.toCharArray();
        Pattern p = Pattern.compile("[a-z]");  
        Matcher m = p.matcher(password);  

        Pattern p1 = Pattern.compile("[A-Z]");  
        Matcher m1 = p1.matcher(password);  
       
        Pattern p2 = Pattern.compile("[0-9]");  
        Matcher m2 = p2.matcher(password);  

        Pattern p3 = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");
        Matcher m3 = p3.matcher(password);  
        if(!m2.find()){
			System.out.println("number error");
			
            count++;
			System.out.println(count);
        }if(!m.find()){
			System.out.println("lower case error");
            count++;
			System.out.println(count);
        }if(!m1.find()){
			System.out.println("upper case error");
            count++;
			System.out.println(count);
        }if(!m3.find()){
			System.out.println("special character error");
            count++;
			System.out.println(count);
        }if(ch.length<6){
			System.out.println("less then 6");
            count=Math.max(count, 6 - password.length());
			System.out.println(count);
        }
        
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
		
		int n=scanner.nextInt();
		//System.out.println("password = ");
        String password = scanner.nextLine();

        int answer = minimumNumber(password);
		System.out.println("error = "+answer);
		
        scanner.close();
    }
}
