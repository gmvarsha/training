package dao;
import java.util.*;
import pojo.Product;
public class ProductDAO {
	private List<Product> productlist;
	private Scanner sc;
	public ProductDAO()
	{
		productlist=new ArrayList<>();
		sc=new Scanner(System.in);
	}
	public void insert(Product p)
	{
		productlist.add(p);
	}
	public List<Product> retreive()
	{
		return productlist;
	}
	public void deleteProduct(int productid)
	{
		Product pdelete=null;
		for(Product p:productlist)
		{
			if(p.getProductid()==productid)
			{
				pdelete=p;
			}
		}
		productlist.remove(pdelete);
	}
	public void updateProduct(int productid)
	{
		Product pupdate=null;
		for(Product p:productlist)
		{
			if(p.getProductid()==productid)
			{
				
				pupdate=p;
				System.out.println("New Product price");
				pupdate.setPrice(sc.nextDouble());
				
			}
		}
			}
	
}

