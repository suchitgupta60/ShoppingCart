import java.util.ArrayList;

public class ShoppingCart
{
	private ArrayList<Item> items;
		
	public ShoppingCart(){
		items = new ArrayList<Item>();
	}
	
	public void insertItem(Item ad){
		items.add(ad);
	}
	
	public void print(){
		for(Item it : items){
			System.out.println(it);
		}
	}
	
	public void removeItem(Item remove){
		items.remove(remove);
	}

	public static void main(String[] args){
		ShoppingCart ss = new ShoppingCart();
		Item i1 = new Item("Iphone",2000,"phone");
		ss.insertItem(i1);
		Item i2 = new Item("car",22350,"audi");
		ss.insertItem(i2);
		Item i3 = new Item("mattress",45000,"cubian");
		ss.insertItem(i3);
		Item i4 = new Item("cigrates",10,"marlboro");
		ss.insertItem(i4);
		Item i5 = new Item("cellphones",200,"Samsung");
		ss.insertItem(i5);
		ss.print();
		System.out.println("the maximum priced item is : "+ ss.getMaximumPricedItem());
		System.out.println("the total amount of all items is :"+ ss.getTotal());
		ss.printInvoice();
		ss.insertUniqueItem(i5);
		}
	
	public Item getMaximumPricedItem(){
		Item i =  items.get(0);
		for(Item its : items){
			if (its.getPrice() > i.getPrice())
				 i = its;
		}
		return i;
	}
	
	public int getTotal(){
		int total = 0;
		for(Item its : items){
			total = total + its.getPrice();
		}
		return total;
	}
	
	public void printInvoice(){
		for(Item its : items){
			System.out.println(its);
			
		}
		System.out.println("total is :" + getTotal());
	}
	
	public void insertUniqueItem(Item a){
		boolean isSame =false ;
		for(Item its : items){
			if(its.getName().equals(a))
				isSame = true;
		}
		if(isSame == false)
			items.add(a);
	}
}

