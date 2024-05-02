
public class product implements Comparable<product> {
	 int id;
	 String name;
	 String category;
	 int price;
	public product(int id, String name, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	@Override
	public int compareTo(product o) {
		
		return this.category.compareTo(o.category);
	}
	 
	 
}
