package exercise5;

public class ShoppingBasket {
	String productName;
	int quantity;
	double price;

	public ShoppingBasket(	String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getDetails() {
		return "Name:" + productName + " ,quantity:" + quantity + " ,price:" + price;
	}
}
