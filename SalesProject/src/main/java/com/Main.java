package com;

import java.util.List;

import javax.jms.JMSException;

import com.data.SalesData;
import com.messaging.MessageConsumer;
import com.messaging.MessageSender;
import com.messaging.SalesException;
import com.model.SaleMessage;

/**
 * @author bhard
 *
 */
public class Main {
    public static void main( String[] args ) {    	
    	SalesData sales = new SalesData();
    	
    	//send sales message using MessageSender
    	try {
    		List<SaleMessage> list = sales.getSalesList();
    		for(SaleMessage msg : list) {
    			MessageSender.publish(msg);
    		}
		} catch (JMSException e) {
			e.printStackTrace();
		}
    	
    	//Receive sales message using MessageConsumer
    	try {
			MessageConsumer.consume();
		} catch (JMSException | SalesException e) {
			if (e instanceof SalesException) {
				System.out.println("Stopping the consumer service");
				System.exit(0);
			}
			e.printStackTrace();
			System.exit(1);
		}
    	
    	System.exit(0);
    }
}
