import java.util.Scanner;
class StringDemo{
	public static void main(String arr[]){
	System.out.println("----------task 1-----------");
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	System.out.println(s);
	
	
	System.out.println("----------Task 2----------");
	String a="Refrigerator";
	System.out.println("String length is "+a.length());	
	
	
	System.out.println("----------Task 3----------");
	String b="Umbrella";
	System.out.println(b.indexOf('e'));
	
	
	System.out.println("----------Task 4----------");
	String c="This is orange juice";
	System.out.println(c.indexOf("orange"));
	
	System.out.println("----------Task 5----------");
	String d="Hello, world";
	System.out.println("First occurence of letter o is "+d.indexOf('o'));
	System.out.println("Last occurence of letter o is "+d.lastIndexOf('o'));
	System.out.println("Character , is on "+d.indexOf(','));
	
	
	System.out.println("----------Task 6----------");
	String name;
	String shortName;
	name=sc.nextLine();
	System.out.println(name);
	char n1 = (name.charAt(0));
	char n2= (name.charAt(name.indexOf(' ')+1));
	int last=name.lastIndexOf(' ')+1;
	String n3=name.substring(last);
		
	System.out.println("Short name is "+n1+"."+n2+"."+n3);
	
	
	System.out.println("----------Task 7----------");
	//Write a program to find the number of vowels, consonents, digits and white space characters in a string.
	int vCount=0;
	int cCount=0;
	int sCount=0;
	String set;
	System.out.println("Enter the input");
	set=sc.nextLine();
	set=set.toLowerCase();
	for(int i=0;i<set.length();i++){
		if(set.charAt(i)=='a'||set.charAt(i)=='e'||set.charAt(i)=='i'||set.charAt(i)=='o'||set.charAt(i)=='u'){
			vCount++;
		}
		else if(set.charAt(i)>='a'&& set.charAt(i)<='z'){
			cCount++;
		}
		else if(set.charAt(i)==' '){
			sCount++;
		}
	}
	System.out.println("Vowel count is: "+vCount);
	System.out.println("Consonent count is :"+cCount);
	System.out.println("Space count is: "+sCount);
	
	
	System.out.println("----------Task 8----------");
	//Write a program to delete all consonents from the string "Hello, have a good day".
	String str="Hello, have a good day";
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			System.out.print(str.charAt(i));
			}
	}
	System.out.println();
	
	System.out.println("----------Task 9----------");
	/*Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. Find out the 
	alphabet with maximum occurrence.*/
	String sentence;
	System.out.println("Enter your input");
	sentence=sc.nextLine();
	sentence=sentence.toLowerCase();
	
	char[] list = new char[sentence.length()];
	AA:
	for(int i=0;i<sentence.length();i++){
		char ch=sentence.charAt(i);
		list[i]=ch;
		int count=0;
		if(ch==' '){
			continue AA;
		}
		for(int k=0;k<list.length;k++){
			if(ch==list[k]){
				continue AA;
				
			}
		}
	BB:
	for(int j=i;j<sentence.length();j++){
		if(sentence.charAt(j)==ch)
			count++;
	}
	System.out.println(ch+" "+count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}