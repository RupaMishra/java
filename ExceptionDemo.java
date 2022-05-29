class ExceptionDemo{
	public static void main(String arg[]){
		try{
			
			
			String s = "abc";
			System.out.println(s.length());
			int i = Integer.parseInt(s);
			System.out.println(i);
			
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println("rest of the code...");  
	}
}



