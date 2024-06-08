package service;

import java.util.*;
import dao.ProductDAO;
import pojo.Product;
public class ProductService {
	
	private Scanner sc;
	private ProductDAO pdao;
	
	
	public ProductService()
	{
		sc=new Scanner(System.in);
		pdao=new ProductDAO();
	}
	public void insertProduct()
	{
		System.out.println("Enter how many products u want to have");
		int noofproduct=sc.nextInt();
		for(int x=1;x<=noofproduct;x++)
		{
			Product p=new Product();
			System.out.println("Enter Product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter Product name ");
			p.setProductname(sc.next());
			System.out.println("Enter Product price ");
			p.setPrice(sc.nextDouble());
			System.out.println("Enter quantity");
			p.setQuantity(sc.nextInt());
			System.out.println("Enter Cateogory");
			p.setCategory(sc.next());
			pdao.insert(p);
			
		}
		
	}
	public void showProducts()
	{
		List<Product> plist=pdao.retreive();
		plist.forEach(prd->
		{
			System.out.println("PRoduct name is "+prd.getProductname());
			System.out.println("Product price is "+prd.getPrice());
		});
	}
	public void deleteProduct() {
		System.out.println("Enter productid which you want to delete");
		int pid=sc.nextInt();
		pdao.deleteProduct(pid);
	}
	public void updateProduct() {
		System.out.println("Enter productid which you want to update");
		int pid=sc.nextInt();
		pdao.updateProduct(pid);
	}
}

