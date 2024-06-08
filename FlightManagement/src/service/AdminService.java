package service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import dao.AdminDAO;
import pojo.Flight;
import pojo.Users;
public class AdminService {
	private AdminDAO addao;
	Flight fobj;
	private Scanner sc;
	public AdminService()
	{
		sc=new Scanner(System.in);
		addao=new AdminDAO();
			}
	public void checkUser(String username,String password)
	{
		boolean val=addao.checkUser(username, password);
		if(val)
		{
			System.out.println("Valid user");
		}
		else
		{
			System.out.println("Invalid user");
		}
	}
	public void register(Users uobj)
	{
		addao.registerUser(uobj);
		
	}
	public void insertFlight()
	{
		System.out.println("Enter how many flight details u want to have ");
		int noofflight=sc.nextInt();
		for(int x=1;x<=noofflight;x++)
		{
		fobj=new Flight();
		System.out.println("Enter Flight id ");
		fobj.setFlightid(sc.nextInt());
		System.out.println("Enter Flight Type");
		fobj.setFlighttype(sc.next());
		System.out.println("Enter no of Stops (Non-stop/SingleStop/TwoStops)");
		fobj.setNoofstops(sc.next());
		System.out.println("Enter Price");
		fobj.setPrice(sc.nextDouble());
		System.out.println("Enter Arrival Date(dd/mm/yyyy)");
		String strdate=sc.next();
		SimpleDateFormat dateformate=new SimpleDateFormat("dd/mm/yyyy");
		Date arrivaldate,deptdateformate;
		System.out.println("Enter Departure  Date(dd/mm/yyyy)");
		String deptdate=sc.next();
	
		try {
			arrivaldate = dateformate.parse(strdate);
			fobj.setArrivalTime(arrivaldate);
			deptdateformate=dateformate.parse(deptdate);
			fobj.setDepartureTime(deptdateformate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter source ");
		fobj.setSource(sc.next());
		System.out.println("Enter Destination ");
		fobj.setDestination(sc.next());
		addao.insertFlight(fobj);
		}
		
		
	}
	public void showFlights()
	{
		List<Flight> flightl=addao.displayFlight();
		flightl.forEach(flight->
		{
			System.out.println("Flight title is "+flight.getFlighttype());
			System.out.println("Flight arrival date is "+flight.getArrivalTime());
		});
	}
}
