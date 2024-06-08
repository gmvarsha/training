package client;
import java.util.*;
import pojo.Users;
import service.AdminService;
public class AdminMenu {
	Scanner sc;
	private AdminService adservice;
	public AdminMenu()
	{
		sc=new Scanner(System.in);
		adservice=new AdminService();
	}
	public void menu()
	{
		String ch="y";
		while(ch.equals("y"))
		{
			System.out.println("1. Admin Crud");
			System.out.println("2. Flight Crud");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					adminCrud();
					break;
			case 2:
					flightCrud();
					break;
			
				
						
			}
			
		}
		System.out.println("Would u like to continue(y/n)");
		ch=sc.next();
	}
	public void adminCrud()
	{
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				System.out.println("Enter user name ");
				String username=sc.next();
				System.out.println("Enter password ");
				String password=sc.next();
				adservice.checkUser(username, password);
				break;
		case 2:
				Users userobj=new Users();
			
				System.out.println("Enter User Name ");
				String user=sc.next();
				userobj.setUsername(user);
				System.out.println("Enter Password ");
				String pass=sc.next();
				userobj.setPassword(pass);
				System.out.println("Enter user type");
				String usertype=sc.next();
				userobj.setUserType(usertype);
				adservice.register(userobj);
				break;
		case 3:
				System.exit(0);
				
				
		}
		
	}
	public void flightCrud()
	{
		String choice="y";
		while(choice.equals("y"))
		{
		System.out.println("1. Insert Flight details ");
		System.out.println("2. Delete Flight details ");
		System.out.println("3. Update Flight Details ");
		System.out.println("4. View Flight Details ");
		System.out.println("5. Go to USer menu");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
				adservice.insertFlight();
				break;
		case 4:
				adservice.showFlights();
				break;
		case 5:
				UserMenu u=new UserMenu();
				u.menu();
				
				
		}
		}
	}
}
