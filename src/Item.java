public class Item {

	private String name;
	private int price;
	private String description;

	public Item(){
		name = "";
		price = 0;
		description = "";
	}
	
	public Item(String n, int p, String d){
		name = n;
		price = p;
		description =d;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void printDetails(){
		System.out.print(description+" "+name+" "+price);
	}
	
	public String toString(){
		return name+" "+price;
	}
	public static void main(String[] args){
		
		Item item = new Item("bikes" , 60000, "ninja" );
		
		System.out.println(item.toString());
	}
}
