package dao;
import java.util.Date;
import java.util.List;
import pojo.Flight;
public class UserDAO {
	private AdminDAO admindao;
	private List<Flight> flightdata;
	public UserDAO()
	{
		admindao=new AdminDAO();
		flightdata=admindao.displayFlight();
		
	}
	public List<Flight> getFlights()
	{
		return flightdata;
	}
	public void retreiveByPriceRange(double minprice, double maxprice) {
		flightdata.forEach(flight->
		{
			if((flight.getPrice()>minprice)&&(flight.getPrice()<maxprice))
			{
				System.out.println("Flight found"+flight.getFlighttype());
			}
		});
	}
	public void retreiveByStops(String noofstops)
	{
		flightdata.stream().filter(f->f.getNoofstops().equals(noofstops)).forEach(f->
		{
			System.out.println("Flight type is "+f.getFlighttype());
		});
		
	}
	public void findByFlightType(String flightType) {
		flightdata.stream().forEach(f->
		{	
			if(f.getFlighttype().equals(flightType)) {
				System.out.println("Flight id is "+f.getFlightid());
			}
			else {
				System.out.println("No flight found");
			}
		});
		
	}
	public void findbyDeptArr(Date arrivaldate, Date deptdateformate) {
		// TODO Auto-generated method stub
		
	}
}
