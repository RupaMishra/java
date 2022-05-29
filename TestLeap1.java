import java.util.*;
import java.io.*;

public class TestLeap1 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
		//System.out.println("********************************");
        int i=0;
        int len  = game.length;
        int lastIndex = len - 1;
		/*for(int j=0;j<=lastIndex;j++){
			System.out.print(game[j]+", ");
		}*/
		//System.out.println("");
        int backCounter = 0;
		int lastStep=0;
        while(i+leap<len){
            if(game[i+leap]==0){
				//printArr(i,i+leap,"LEAP",game);
                i+=leap;
                game[i]=1;
                backCounter=0;
				lastStep = leap;
            }else if(game[i+1]==0){
				//printArr(i,i+1,"FORWARD",game);
                i++;
                game[i]=1;
				lastStep = 1;
            }else if(i>0 && game[i-1]==0 && backCounter<leap){
				//printArr(i,i-1,"BACKWARD",game);
                i--;
                game[i]=1;
                backCounter++;
				lastStep = -1;
            }else if(game[i-leap]==0||game[i-1]==0){
                i-=lastStep;
            }else{
				System.out.println("i: "+i);
				return false;
			}
        }
        return true;
       
    }
	public static boolean canWin2(int leap, int[] game) {
         return isSolvable(leap,game,0);
    }

	public static boolean isSolvable(int leap,int[] game,int i){
		System.out.println("index : "+i);
		if(i<0 || game[i]==1){
			return false;
		}else if(i+leap>=game.length || i+1>=game.length){
			return true;
		}
		game[i]=1;
		return isSolvable(leap,game,i+leap) || isSolvable(leap,game,i+1) || isSolvable(leap,game,i-1);
	}
	
	public static void printArr(int previousIndex, int lastIndex,String type, int[] game){
		System.out.println("------------------------------");
		System.out.println(type+" : "+previousIndex+" to "+lastIndex);
			for(int j=0;j<game.length;j++){
				if(j==previousIndex){
					System.out.print("x, ");
				}else if(j==lastIndex){
					System.out.print("*, ");
				}else{
					System.out.print(game[j]+", ");
				}
			}
		
		
		System.out.println();
	}
	public static String[] readanswers(int size) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("OneDArray/answers.txt"));
		String answer[]=new String[size];
		for(int i=0;i<size;i++){
			answer[i]=scan.nextLine();
		}
		return answer;
	}
	
	public static boolean compareArr(){
		boolean areEqual = true;
		try{
		BufferedReader reader1 = new BufferedReader(new FileReader("F:\\java\\answer.txt"));

			BufferedReader reader2 = new BufferedReader(new FileReader("F:\\java\\myAns.txt"));
			

			int lineNum = 1;
			String line1 = reader1.readLine();

			String line2 = reader2.readLine();
			while (line1 != null || line2 != null)
			{
					if(line1 == null || line2 == null)
					{
							areEqual = false;
							break;
					}
					else if(! line1.equalsIgnoreCase(line2))
					{
							areEqual = false;
							break;
					}

					line1 = reader1.readLine();
					line2 = reader2.readLine();
					lineNum++;
			}
		}catch(Exception e){}
		return areEqual;
	}
	
	public static void arr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("OneDArray/inputs.txt"));
        int q = scan.nextInt();
		String[] anws = readanswers(q);
		String[] myAns = new String[q];
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
			System.out.println("\n-----------------------------");
			arr(game);
			System.out.println("\n n: "+n+", leap: "+leap+", index : "+q);
			System.out.println();
			System.out.println();
			myAns[q] = (canWin2(leap, game)) ? "YES" : "NO";
			if(!myAns[q].trim().equals(anws[q].trim())){
				System.out.println("false : myAns: "+myAns[q]+", outAns: "+anws[q]);
				//break;
			}else{
				System.out.println("true : myAns: "+myAns[q]+", outAns: "+anws[q]);
			}
			try{Thread.sleep(2000);}catch(Exception e){}
        }
		
		System.out.println("finished");
        scan.close();
    }
}
