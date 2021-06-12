package com.zeller.computerstore.system;

import java.util.ArrayList;
import java.util.List;

import com.zeller.computerstore.model.Products;
import com.zeller.computerstore.pricing.rules.LaunchPricingRule;
import com.zeller.computerstore.pricing.rules.PricingRule;

/**
 * Class for checking out the items
 * @author Dew
 *
 */
public class CheckoutSystem {

	/**
	 * Calculate the total price using a pricing rule
	 * @param scannedSKUs
	 * @return
	 */
	public static double checkout(String scannedSKUs) {
        
		
		String[] skuArr = scannedSKUs.split(",");
		
		List<Products> productList = new ArrayList<Products>();
		for (String sku:skuArr) {
			productList.add(Products.valueOf(sku));
		}
		
		PricingRule launchPricingRule = new LaunchPricingRule(productList);
		
		double total = launchPricingRule.calcTotal();
		System.out.println("Total :" +total);
		
		return total;
	}
	
	
	
	
}
