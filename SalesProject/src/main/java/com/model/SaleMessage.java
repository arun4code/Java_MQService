package com.model;

import java.io.Serializable;

public class SaleMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private final String productType;	//product type
    private final long quantity;		//total units
    private final double value;			//cost per unit
    private final String msgType; 		//to define the message type


    public SaleMessage(final String msgType, final String productType, final long quantity, final double value) {
        this.msgType = msgType;
    	this.productType = productType;
        this.quantity = quantity;
        this.value = value;
    }

    public String getProductType() {
        return productType;
    }

    public long getQuantity() {
        return quantity;
    }

    public double getValue() {
        return value;
    }

    @Override
 	public String toString() {
 		return "SaleMessage [productType=" + productType + ", quantity=" + quantity + ", value=" + value + "]";
 	}

	public String getMsgType() {
		return msgType;
	}

}
