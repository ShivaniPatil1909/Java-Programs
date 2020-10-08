package collection.set;
import java.util.*;

class Book
{
	
	private String b_name;
	private int b_id;
	private float price;
	
	public Book(String b_name, int b_id, float price) {
		super();
		this.b_name = b_name;
		this.b_id = b_id;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [Book name=" + b_name + ", bOok_id=" + b_id + ", price=" + price + "]";
	}	
	
}


