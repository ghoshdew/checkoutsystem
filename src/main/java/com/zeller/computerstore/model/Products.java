package com.zeller.computerstore.model;

/**
 * Enum to hold all the items sku, product name and price
 * @author Dew
 *
 */
public enum Products {

	//initially set with default price
	atv("Apple TV",0),
	ipd("Super iPad",0),
	mbp("MacBook Pro",0),
	vga("VGA adapter",0);
	
	
	private String productName;
	public double price;
	
	Products(String productNameArg,double priceArg){
		productName = productNameArg;
		price = priceArg;
	}
	
}
