package day10;

public class Product {

	private String name;

	private int price;
	
	
	public Product() {}
	
	public Product(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	//삽입 메서드
	public void insertProduct(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	public void print() {
		System.out.println("상품명 : "+name+ "  가격 : "+price+"원");	
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
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
