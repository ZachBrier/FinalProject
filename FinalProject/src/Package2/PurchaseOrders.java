package Package2;

import java.util.Date;

public class PurchaseOrders {
	private Date date;
	private String estArrivalTime;
	private int ordSize;
	
	public PurchaseOrders() {
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEstArrivalTime() {
		return estArrivalTime;
	}

	public void setEstArrivalTime(String estArrivalTime) {
		this.estArrivalTime = estArrivalTime;
	}

	public int getOrdSize() {
		return ordSize;
	}

	public void setOrdSize(int ordSize) {
		this.ordSize = ordSize;
	}
	
	public String toString() {
		String str = " ";
		return str;
	}
}
