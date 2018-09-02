package com.messaging;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.model.SaleMessage;

/**
 * @author bhard
 *
 */
public class MessageSender {  
    public static void publish(SaleMessage msg) throws JMSException {
    	Connection connection = null;
		Session session = null;
		javax.jms.MessageProducer producer = null;

		
    	try {
    	    System.setProperty("org.apache.activemq.SERIALIZABLE_PACKAGES","*");

            // Create a ConnectionFactory
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            //connectionFactory.setTrustedPackages(Arrays.asList("org.apache.activemq.SERIALIZABLE_PACKAGES","*"));
            
            // Create a Connection
            connection = connectionFactory.createConnection();
            connection.start();

            // Create a Session
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // Create the destination
            Destination destination = session.createQueue("SALES_Q");

            producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            ObjectMessage objectMessage = session.createObjectMessage();
            objectMessage.setObject(msg);

            System.out.println("Sent message: "+ msg);
            producer.send(objectMessage);
        }
        catch (JMSException e) {
            System.out.println("Exception: " + e.getMessage());
            throw e;
        }
    	finally {
			if (producer != null)
				producer.close();
            if(session != null)
            	session.close();
            if(connection != null)
            	connection.stop();
		}
    }  
    

}  