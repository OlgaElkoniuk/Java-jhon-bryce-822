
public class Seating {
	
	boolean available = true;
	double price;
	
	public Seating(boolean available, double price) {
		super();
		this.available = available;
		this.price = price;
	}



	public void buySeat(){
		available = false;
	}
}
