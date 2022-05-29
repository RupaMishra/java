import java.util.*;
import java.io.*;

public class TestLeap {

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
        while(i+leap<len){
			
            if(game[i+leap]==0){
				//printArr(i,i+leap,"LEAP",game);
                i+=leap;
                game[i]=1;
                backCounter=0;
            }else if(game[i+1]==0){
				//printArr(i,i+1,"FORWARD",game);
                i++;
                game[i]=1;
            }else if(i>0 && game[i-1]==0 && backCounter<leap){
				//printArr(i,i-1,"BACKWARD",game);
                i--;
                game[i]=1;
                backCounter++;
            }else{
                return false;
            }
        }
        return true;
       
    }
	public static boolean canWin2(int leap, int[] game) {
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
        while(i+leap<len){
			
            if(game[i+leap]==0){
				printArr(i,i+leap,"LEAP",game);
                i+=leap;
                game[i]=1;
                backCounter=0;
            }else if(game[i+1]==0){
				printArr(i,i+1,"FORWARD",game);
                i++;
                game[i]=1;
            }else if(i>0 && game[i-1]==0 && backCounter<leap){
				printArr(i,i-1,"BACKWARD",game);
                i--;
                game[i]=1;
                backCounter++;
            }else{
                return false;
            }
        }
        return true;
       
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
	
	public static int compareArr(String[] a1, String[] a2){
		for(int i=0;i<a1.length;i++){
			if(!a1[i].equals(a2[i])){
				return i;
			}
		}
		return -1;
	}
	
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("OneDArray/inputs.txt"));
        int q = scan.nextInt();
		String[] anws = readanswers(q);
		String[] myAns = new String[q];
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int ans[]=new int[n];
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            //System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
			myAns[q] = (canWin(leap, game)) ? "YES" : "NO";
			if(!anws[q].equals(myAns[q])){
				System.out.println("index : "+q);
				System.out.println("N :    "+n);
				System.out.println("Leap : "+leap);
				System.out.println("Theres : "+anws[q]);
				System.out.println("ours : "+myAns[q]);
				for (int i = 0; i < n; i++) {
					System.out.print(game[i]+", ");
				}
				canWin2(leap,game);
				return;
			}
        }
		int wrongIndex = compareArr(anws,myAns);
		System.out.println(wrongIndex);
        scan.close();
    }
}
