package com.zeller.computerstore.pricing.rules;

import java.util.List;

import com.zeller.computerstore.model.Products;

/**
 * Abstract class which can be inherited to have different pricing rules
 * @author Dew
 *
 */
public abstract class PricingRule {
	
	List<Products> productList;
	
	public abstract double calcTotal();

	public PricingRule(List<Products> productList) {
		super();
		this.productList = productList;
	}
}
