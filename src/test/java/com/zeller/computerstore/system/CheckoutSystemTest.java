package com.zeller.computerstore.system;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.zeller.computerstore.config.Configurator;

public class CheckoutSystemTest {
	
	private static final double DELTA = 1e-15;

	 @BeforeClass
	    public static void initProps() {
		 Configurator cfg = new Configurator();
			try {
				cfg.loadProps();
				
			} catch (Exception e) {
				System.err.println("Unable to load properties file");
			}
		 System.out.println("This is executed once for class");
	   }
	 
	    @Test
	    public void testScenario1() {
	    	String scannedSKUs = "atv,atv,atv,vga";
	    	double total = CheckoutSystem.checkout(scannedSKUs);
	    	assertEquals(total, 249.00,DELTA);
	    }
	    
	    @Test
	    public void testScenario2() {
	    	String scannedSKUs = "atv,ipd,ipd,atv,ipd,ipd,ipd";
	    	double total = CheckoutSystem.checkout(scannedSKUs);
	    	assertEquals(total, 2718.95,DELTA);
	    }
	    
	    @Test
	    public void testScenario3() {
	    	String scannedSKUs = "atv,atv,atv,atv";
	    	double total = CheckoutSystem.checkout(scannedSKUs);
	    	assertEquals(total, 328.5,DELTA);
	    }
	    
	    @Test
	    public void testScenario4() {
	    	String scannedSKUs = "ipd,ipd,ipd,ipd";
	    	double total = CheckoutSystem.checkout(scannedSKUs);
	    	assertEquals(total, 2199.96,DELTA);
	    }
	    @Test
	    public void testScenario5() {
	    	String scannedSKUs = "mbp,mbp";
	    	double total = CheckoutSystem.checkout(scannedSKUs);
	    	assertEquals(total, 2799.98,DELTA);
	    }
	    
	    @Test
	    public void testScenario6() {
	    	String scannedSKUs = "vga";
	    	double total = CheckoutSystem.checkout(scannedSKUs);
	    	assertEquals(total, 30.0,DELTA);
	    }
}
