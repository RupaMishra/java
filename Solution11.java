    import java.util.*;
	import java.io.*;
    public class Solution11 {
        public static void main(String[] args) {
		
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max=0;
			int[] num = new int[n];
			try(BufferedReader br = new BufferedReader(new FileReader("F:\\java\\output.txt"))) {
			String[] arrayContent = br.readLine().split(" ");
			

			for(int i = 0; i<n; i++){
				num[i] = Integer.parseInt(arrayContent[i]);
			}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//for(int i=0;i<n;i++){
			//	System.out.println(num[i]);
			//}
			
            for(int i=0;i<n-m+1;i++){
                int count=1;
                for(int j=0;j<m;j++){
                    //System.out.println("i= "+num[i]+" j= "+num[j]);
                    if(num[i]!=num[j+i]){
                        count++;
                        //System.out.println("count = "+count);
                    }
                }
                //System.out.println("finalcount = "+count);
				
                if(count>max){
                    max=count;
                   deque.add(count);
                }
                 
            }
            //System.out.println("deque : ");
            System.out.println(max);
        }
    }



