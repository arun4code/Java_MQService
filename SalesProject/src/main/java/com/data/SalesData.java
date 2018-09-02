package com.data;

import java.util.ArrayList;
import java.util.List;

import com.model.SaleMessage;

/**
 * @author bhard
 * @desc dummy data to send by sender
 */
public class SalesData {

	public SalesData() {
		createData();
	}
	
	List<SaleMessage> salesList = new ArrayList<>();

	public List<SaleMessage> getSalesList() {
		return salesList;
	}

	public void setSalesList(List<SaleMessage> salesList) {
		this.salesList = salesList;
	}
	
	private void createData() {

		salesList.add(new SaleMessage("M1", "Apple", 10, 100));
		salesList.add(new SaleMessage("M1", "Apple", 10, 100));
		salesList.add(new SaleMessage("M1", "Apple", 10, 100));
		salesList.add(new SaleMessage("M1", "Apple", 10, 100));
		salesList.add(new SaleMessage("M1", "Apple", 10, 100));
		salesList.add(new SaleMessage("M1", "Apple", 10, 100));
		salesList.add(new SaleMessage("M1", "IBM", 10, 100));
		salesList.add(new SaleMessage("M1", "IBM", 10, 100));
		salesList.add(new SaleMessage("M1", "IBM", 10, 100));
		salesList.add(new SaleMessage("M1", "IBM", 10, 100));
		salesList.add(new SaleMessage("M1", "IBM", 10, 100));
		salesList.add(new SaleMessage("M1", "IBM", 10, 100));
		salesList.add(new SaleMessage("M2", "Mac", 10, 100));
		salesList.add(new SaleMessage("M2", "Mac", 10, 100));
		salesList.add(new SaleMessage("M2", "Mac", 10, 100));
		salesList.add(new SaleMessage("M2", "Mac", 10, 100));
		salesList.add(new SaleMessage("M2", "Mac", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN", 10, 100));
		

		salesList.add(new SaleMessage("M1", "Seagate", 10, 100));
		salesList.add(new SaleMessage("M1", "Seagate", 10, 100));
		salesList.add(new SaleMessage("M1", "Seagate", 10, 100));
		salesList.add(new SaleMessage("M1", "Seagate", 10, 100));
		salesList.add(new SaleMessage("M1", "Seagate", 10, 100));
		salesList.add(new SaleMessage("M1", "Seagate", 10, 100));
		salesList.add(new SaleMessage("M1", "Seagate", 10, 100));
		salesList.add(new SaleMessage("M1", "Seagate", 10, 100));
		

		salesList.add(new SaleMessage("M1", "Intex", 10, 100));
		salesList.add(new SaleMessage("M1", "Intex", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN10.1", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN10.1", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN10.1", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN10.1", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN10.1", 10, 100));
		salesList.add(new SaleMessage("M1", "WIN10.1", 10, 100));
		

		salesList.add(new SaleMessage("M1", "Ubuntu", 10, 100));
		salesList.add(new SaleMessage("M1", "Ubuntu", 10, 100));
		salesList.add(new SaleMessage("M1", "Ubuntu", 10, 100));
		salesList.add(new SaleMessage("M1", "Ubuntu", 10, 100));
		salesList.add(new SaleMessage("M1", "Ubuntu", 10, 100));
		salesList.add(new SaleMessage("M1", "Ubuntu", 10, 100));
		salesList.add(new SaleMessage("M1", "Ubuntu", 10, 100));
		salesList.add(new SaleMessage("M1", "Ubuntu", 10, 100));
		

		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));

		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));

		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
		salesList.add(new SaleMessage("M1", "Adobe", 10, 100));
	}
	
}
