package task;

public class Inventory {
	private int id;
	private String nameofproduct;
	private int quantity;
	private float price;
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameofproduct() {
		return nameofproduct;
	}

	public void setNameofproduct(String nameofproduct) {
		this.nameofproduct = nameofproduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Inventory(int id, String nameofproduct, int quantity, float price) {
		super();
		this.id = id;
		this.nameofproduct = nameofproduct;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return id + ", nameofproduct=" + nameofproduct + ", quantity=" + quantity + ", price="
				+ price;
	}
	
	

}
