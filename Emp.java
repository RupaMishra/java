class Emp{
	
	int userid;
	String name;
	Address address;
	
	Emp(int userid , String name,int id,String area){
		this.userid = userid;
		this.name = name;
		address.id = id;
		address.area = area;
	}
	
	void Display(){
		System.out.println(userid+" "+name+" "+address.id+" "+address.area);
	}
	public static void main(String[] args){
		Emp o1 = new Emp(01 ,"a",2,"area");
		o1.Display();
	}
}