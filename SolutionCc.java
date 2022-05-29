import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionCc {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        StringBuilder output = new StringBuilder("");
        for(char letter : s.toCharArray())
            {
                if(letter > 64 && letter < 91)//Capital letter
                {
                    char encrypted = (char) (letter+k);
                    if(encrypted > 90)
                    {
                        encrypted = (char) ((encrypted % 90) + 64);
                    }
                    output.append(encrypted);
                }
                else if(letter > 96 && letter < 123)//Lower case letter
                {
                    char encrypted = (char) (letter+k);
                    if(encrypted > 122)
					{
						System.out.println(".....Running....");
                        encrypted = (char) ((encrypted % 122) + 96);
						System.out.println(encrypted);
                    }
                    output.append(encrypted);
                }
                else//Symbol
                {
                    output.append(letter);
                }
            }
        return output.toString();
    }


    public static void main(String[] args) throws IOException {
       
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();

        String s = sc.nextLine();

        int k = sc.nextInt();

        String result = caesarCipher(s, k);
		System.out.println(result);
        sc.close();
    }
}
