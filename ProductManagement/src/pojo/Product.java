package pojo;
public class Product {
	private int productid;
	
	private String productname;
	private double price;
	private int quantity;
	private String category;
	public Product()
	{
		
	}
	public Product(int productid,String productname,int quantity,double price,String category)
	{
		this.productid=productid;
		this.productname=productname;
		this.price=price;
		this.quantity=quantity;
		this.category=category;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}