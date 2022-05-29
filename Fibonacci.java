import java.util.*;
  
class Fibonacci{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn=new Scanner(System.in);
      
      int num1=0;
      int num2=1;
      int result=1;
      
      int n = scn.nextInt();
      System.out.println("0");
      while((n-1)!=0){
          System.out.println(result);
          result=num1+num2;
          num1=num2;
          num2=result;
          
          n--;
      }
   }
}