package client;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import dao.AdminDAO;
import pojo.Flight;
import service.UserService;
public class UserMenu {
	private Scanner sc;
	public UserMenu usermenu;
	private AdminDAO admindao;
	private UserService userservice;
	public UserMenu()
	{
		sc=new Scanner(System.in);
		admindao=new AdminDAO();
		userservice=new UserService();
		
	}
	public void menu()
	{
		
		System.out.println("1.Show Flights on Source or Destination");
		System.out.println("2. Filtering Data");
		System.out.println("3. Book Flight");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
				System.out.println("Enter Source ");
				String source=sc.next();
				System.out.println("Enter Destination ");
				String destination=sc.next();
				userservice.findBySourceOrDestination(source,destination);
		case 2:
				filtermenu();
				
		}
	}
	private void filtermenu() {
		System.out.println("1. According to price range");
		System.out.println("2. According to source date and destination date");
		System.out.println("3. According to no of stops ");
		System.out.println("4. Type of Flight");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				System.out.println("Enter minimum price ");
				double minprice=sc.nextDouble();
				System.out.println("Enter MAximum price");
				double maxprice=sc.nextDouble();
				userservice.findByPriceRange(minprice,maxprice );
				break;
		case 2:
			System.out.println("Enter Arrival Date(dd/mm/yyyy)");
			String strdate=sc.next();
			SimpleDateFormat dateformate=new SimpleDateFormat("dd/mm/yyyy");
			Date arrivaldate,deptdateformate;
			System.out.println("Enter Departure  Date(dd/mm/yyyy)");
			String deptdate=sc.next();
			
			try {
				arrivaldate = dateformate.parse(strdate);
				deptdateformate=dateformate.parse(deptdate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			userservice.findbyDeptArr(arrivaldate,deptdateformate);

		case 3:
				System.out.println("Enter no of stops");
				String noofstops=sc.next();
				userservice.findByStops(noofstops);
		case 4:
			System.out.println("Enter flight type");
			String flightType=sc.next();
			userservice.findByFlightType(flightType);

		}
		
	}
}
