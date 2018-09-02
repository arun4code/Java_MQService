package com.messaging;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.model.SaleMessage;

/**
 * @author bhard
 *
 */
public class MessageConsumer {
	public static void consume()  throws JMSException, SalesException {
		
		Connection connection = null;
		Session session = null;
		javax.jms.MessageConsumer consumer = null;
		try {
		    //System.setProperty("org.apache.activemq.SERIALIZABLE_PACKAGES","*");

            // Create a ConnectionFactory
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            //connectionFactory.setTrustedPackages(Arrays.asList("java.lang","com.mode.SaleMessage"));
            // Create a Connection
            connection = connectionFactory.createConnection();
            connection.start();

            // Create a Session
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // Create the destination (Topic or Queue)
            Destination destination = session.createQueue("SALES_Q");

            // Create a MessageConsumer from the Session to the Topic or Queue
            consumer = session.createConsumer(destination);

            // Wait for a message
            
            while(true) {
	            Message message = consumer.receive(1000);
	
	            if (message instanceof ObjectMessage) {
	            	Object object = ((ObjectMessage) message).getObject();
	            	
	            	System.out.println("Object Received" + ((ObjectMessage) message).getObject());
	            	
	            	SaleMessage msg = (SaleMessage)object;
	            		            	
	            	String type = msg.getProductType();
	                
	                if (type == null) 
	                	throw new SalesException("No message received");
	                
	                MessageProcessor.recordSale(msg);
	            	
	            }
            }

        } catch (JMSException e) {
            System.out.println("Exception in consume: " + e.getMessage());
            throw e;
        }
		finally {
			if (consumer != null)
				consumer.close();
            if(session != null)
            	session.close();
            if(connection != null)
            	connection.stop();
		}
	}
}
