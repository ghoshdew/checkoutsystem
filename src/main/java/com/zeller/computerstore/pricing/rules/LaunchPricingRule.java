package com.zeller.computerstore.pricing.rules;

import java.util.List;

import com.zeller.computerstore.config.Configurator;
import com.zeller.computerstore.model.Products;

/**
 * Pricing Rule as per the coding challenge
 * @author Dew
 *
 */
public class LaunchPricingRule extends PricingRule{

	public LaunchPricingRule(List<Products> productList) {
		super(productList);
	}

	/**
	 * Calculate the total by iterating over the products
	 */
	public double calcTotal() {

		int atvCounter = 0;
		int ipdCounter = 0;

		double ipdPrice = Products.ipd.price;

		double total = 0;

		for (Products prd : productList) {

			if (prd.name().equalsIgnoreCase(Products.atv.name())) {
				atvCounter++;
				if (atvCounter == 3) { //skip the 3rd since it will be given in price for 2
					continue;
				} else {
					total = total + Products.atv.price;
				}
			} else if (prd.name().equalsIgnoreCase(Products.ipd.name())) {
				ipdCounter++;
				if (ipdCounter > 4) {//If it is greater than 4 then the price will be different
					ipdPrice = Double.valueOf(Configurator.properties.getProperty("ipd.discount.price"));
				}
			} else if (prd.name().equalsIgnoreCase(Products.vga.name())) {
				total = total + Products.vga.price;
			} else if (prd.name().equalsIgnoreCase(Products.mbp.name())) {
				total = total + Products.mbp.price;
			}

		}

		//adding iPad cost since not done previously
		total = total + (ipdCounter * ipdPrice);

		return total;

	}

}
