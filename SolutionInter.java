import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionInter {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] count=new int[queries.length];
        AA:
        for(int i=0;i<queries.length;i++){
            BB:
            for(int j=0;j<strings.length;j++){
				System.out.println("its running...1");
				System.out.println("queries[i] = "+queries[i]);
				System.out.println("strings[j]"+strings[j]);
                if(queries[i].compareTo(strings[j])==0){
                    System.out.println("its running...");
                    count[i]++;
					System.out.println("count["+i+"]="+count[i]);
                    continue BB;
                }
            }
        }
        return count;

    }


    public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
        int stringsCount = sc.nextInt();sc.nextLine();

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = sc.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = sc.nextInt();sc.nextLine();

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = sc.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        sc.close();
    }
}
