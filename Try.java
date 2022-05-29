    import java.util.*;
    public class Try {
	public static void main(String[] args) {
			long startTime = System.nanoTime();
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            int[] num =new int[n];
            int max=0;
            for (int i = 0; i < n; i++) {
                num[i] = 100000;
            }
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
			long elapsedTime = System.nanoTime() - startTime;
			System.out.println("Total execution time in millis: "+ elapsedTime/1000000000);
        }
    }
