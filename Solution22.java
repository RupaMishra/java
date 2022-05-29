import java.util.*;

public class Solution22 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int i=0;
        while(i<game.length){
            if(i+leap>=game.length){
                return true;
            }else if(game[i+leap]==0){
               i = i + leap;
            }else if(game[i+1]==0){
                i++;
            }else if(game[i+leap]==1){
				if(game[i-1]==0){// if last step is leap then only we'll do this.
					i--;
				}else if(game[i-1]==1){
					if(game[i+leap]==1){
						return false;
					}
					
				}
			}			
			else{
				return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}