package client;
import java.util.*;

import service.ProductService;
public class Menu {
	private Scanner sc;
	private ProductService pservice;
	public Menu()
	{
		sc=new Scanner(System.in);
		pservice=new ProductService();
	}
	public void createMenu()
	{
		String choice="y";
	
		while(choice.equals("y"))
		{
		System.out.println("Enter your choice");
		System.out.println("1. Insert Product");
		System.out.println("2. Delete product");
		System.out.println("3. Update Product ");
		System.out.println("4. View list of products");
		System.out.println("5. Exit");
		int options=sc.nextInt();
		switch(options)
		{
		case 1:
				pservice.insertProduct();
				break;
		case 2:
				pservice.deleteProduct();
				break;
		case 3:
			pservice.updateProduct();
			break;
					
		case 4:
				pservice.showProducts();
				break;
				
		case 5:
			System.out.println("Exiting");

					System.exit(0);
		}
		System.out.println("Would u like to continue (y/n)");
		choice=sc.next();
		
		}
	}
		

}