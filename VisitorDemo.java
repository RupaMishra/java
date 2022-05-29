interface ItemElement{
	int accept(ShoppingCartVisitor visitor);
}
interface ShoppingCartVisitor{
	int visit(Food food);
	int visit(Book book);
}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
	public int visit(Food food){
		int cost=food.getPricePerKg()*food.getWeight();
		System.out.println(food.getName()+" cost = "+cost);
		return cost;
	}
	public int visit(Book book){
		int cost=0;
		if(book.getPrice()>50){
			cost=book.getPrice()-5;
		}else{
			cost=book.getPrice();
		}
		System.out.println("Book ISBN::"+book.getIsbn() + " cost ="+cost); 
        return cost;
	}
}

class Food implements ItemElement{
	private int pricePerKg;
	private int weight;
	private String name;
	
	
    public Food(int priceKg, int wt, String nm) 
    { 
        this.pricePerKg=priceKg; 
        this.weight=wt; 
        this.name = nm; 
    } 
   
    public int getPricePerKg()  
    { 
        return pricePerKg; 
    } 
   
    public int getWeight()  
    { 
        return weight; 
    } 
   
    public String getName() 
    { 
        return this.name; 
    }
	public int accept(ShoppingCartVisitor visitor){
		return visitor.visit(this);
	}
}

class Book implements ItemElement{
	private String isbn;
	private int price;
	public Book(int price, String isbn){
		this.price=price;
		this.isbn=isbn;
	}
	public String getIsbn(){
		return isbn;
	}
	public int getPrice(){
		return price;
	}
	public int accept(ShoppingCartVisitor visitor)  
    { 
        return visitor.visit(this); 
    } 
}

class VisitorDemo{
	public static int calculatPrice(ItemElement[] items){
		ShoppingCartVisitor sp = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement i:items){
			sum = sum + i.accept(sp);
		}
		return sum;
	}
	
	public static void main(String args[]){
		ItemElement[] items = new ItemElement[]{new Book(20, "1234"), 
                              new Book(100, "5678"), new Food(10, 2, "Banana"), 
                              new Food(5, 5, "Apple")}; 
							  
		int total=calculatPrice(items);
		System.out.println("Total Cost = "+total); 
	}
}