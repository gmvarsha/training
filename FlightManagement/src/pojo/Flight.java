package pojo;
import java.util.Date;
public class Flight {
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getFlighttype() {
		return flighttype;
	}
	public void setFlighttype(String flighttype) {
		this.flighttype = flighttype;
	}
	public String getNoofstops() {
		return noofstops;
	}
	public void setNoofstops(String noofstops) {
		this.noofstops = noofstops;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	private int flightid;
	private String flighttype;
	private String noofstops;
	private double price;
	private Date arrivalTime;
	private Date departureTime;
	private String source;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	private String destination;
}
