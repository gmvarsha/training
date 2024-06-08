package dao;
import java.util.ArrayList;
import java.util.List;
import pojo.Flight;
import pojo.Users;
public class AdminDAO {
	private List<Users> userlist;
	private List<Flight> flightlist;
	public AdminDAO()
	{
		userlist=new ArrayList<>();
		flightlist=new ArrayList<>();
	}
	public void registerUser(Users uobj)
	{
		userlist.add(uobj);
	}
	public boolean checkUser(String username,String password)
	{
		boolean result=false;
		for(Users u:userlist)
		{
			if(u.getUsername().equals(username)&&u.getPassword().equals(password))
			{
				result=true;
			}
			else
			{
				result=false;
			}
		}
		return result;
		
	}
	public void insertFlight(Flight f)
	{
		flightlist.add(f);
	}
	public List<Flight> displayFlight()
	{
		return flightlist;
	}
}
