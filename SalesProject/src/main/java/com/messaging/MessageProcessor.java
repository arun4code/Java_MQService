package com.messaging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.model.SaleMessage;


/**
 * @author bhard
 *
 */
public class MessageProcessor {
	
    private final static Logger logger = Logger.getLogger(MessageProcessor.class);
    
	private static Map<String, List<SaleMessage>> salesData = new HashMap<>();
	private static long msgCounter = 0;
    private static long stopCounter = 0;
    
    public static void recordSale(SaleMessage message) throws SalesException {
    	logger.info("recording the sale for product : " + message.getProductType());
        if (salesData.containsKey(message.getProductType())) {
            salesData.get(message.getProductType()).add(message);
        } else {
            List<SaleMessage> messageForProductTYpe = new ArrayList<>();
            messageForProductTYpe.add(message);
            salesData.put(message.getProductType(), messageForProductTYpe);
        }

        msgCounter = msgCounter + 1;
        stopCounter = stopCounter + 1;

        if (msgCounter == 10) {
        	recordAfter10thMessage();		//recording in log, or in DB
            msgCounter = 0;
        }

        if (stopCounter == 50) {			// throw exception after 50 records, and consumer will be stopped.
        	throw new SalesException("Stoping after 50 request");
        }
    }

    
    private static void recordAfter10thMessage() {

        Map<String, Integer> numOfSales = salesData.entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey(),
                        entry -> entry.getValue().size()));

        Map<String, Double> totalValue = totalValueForProduct(salesData);

        totalValue.entrySet().stream().forEach(entry ->
                logger.info("Product Type: " + entry.getKey() + " |  num of sale (freq): " 
        + numOfSales.get(entry.getKey())
        + ", Total Value: " + entry.getValue()));

    }
    
    private static Map<String, Double> totalValueForProduct(Map<String, List<SaleMessage>> saleData) {

        return saleData.entrySet().stream().collect(Collectors.toMap(
        		
                entry -> entry.getKey(),
                entry -> entry.getValue().stream().map(msg -> calculateTotalValue(msg)).collect(Collectors.toList())
                        .stream().reduce(0.0, Double::sum)
        ));
    }
    
    private static Double calculateTotalValue(SaleMessage message) {
    	return message.getValue() * message.getQuantity();
    }
    
}
