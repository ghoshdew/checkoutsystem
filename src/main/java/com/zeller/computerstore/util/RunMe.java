package com.zeller.computerstore.util;

import java.io.IOException;

import com.zeller.computerstore.config.Configurator;
import com.zeller.computerstore.system.CheckoutSystem;

/**
 * Utility class with main method to test the checkout system
 * @author Dew
 *
 */
public class RunMe {

	/**
	 * Main method to test the checkout system
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		//load the properties file 
		Configurator cfg = new Configurator();
		cfg.loadProps();

		//sample skus
		String scannedSKUs = "atv,ipd,ipd,atv,ipd,ipd,ipd";
		CheckoutSystem.checkout(scannedSKUs);
	}

}
