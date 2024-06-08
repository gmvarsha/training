package service;
import java.util.*;
import dao.UserDAO;
import pojo.*;
public class UserService {
		private List<Flight> flightlist;
		private UserDAO userdao;
		public UserService()
		{
			userdao=new UserDAO();
			flightlist=userdao.getFlights();
		}
	public void findBySourceOrDestination(String source, String destination) {
		for(Flight f:flightlist)
		{
			if(f.getSource().equals(source)||f.getDestination().equals(destination))
			{
				System.out.println("Flight details are "+f.getFlighttype()+" "+f.getPrice());
			}
			else
			{
				System.out.println("Flight not found");
			}
		}
		
	}
	public void findByPriceRange(double minprice, double maxprice) {
		userdao.retreiveByPriceRange(minprice,maxprice);
		
	}
	public void findByStops(String noofstops) {
		userdao.retreiveByStops(noofstops);
		
	}
	public void findByFlightType(String flightType) {
		userdao.findByFlightType(flightType);
	}
	public void findbyDeptArr(Date arrivaldate, Date deptdateformate) {
		userdao.findbyDeptArr(arrivaldate,deptdateformate);
	}
}
