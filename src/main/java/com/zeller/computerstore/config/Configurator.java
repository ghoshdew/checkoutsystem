package com.zeller.computerstore.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.zeller.computerstore.model.Products;

/**
 * Configuration class to be invoked before Checking out
 * @author Dew
 *
 */
public class Configurator {
	
	public static Properties properties=new Properties();  
	
	/**
	 * Load the dynamic values from properties value
	 * @throws IOException
	 */
	public void loadProps() throws IOException {
		InputStream  reader=getClass().getClassLoader().getResourceAsStream("prices.properties");  
	      
	    
	    properties.load(reader);  
	    
	    //set the values of Product enum as per the values in properties file
	    Products.atv.price = Double.valueOf(properties.getProperty("atv.price"));
	    Products.ipd.price = Double.valueOf(properties.getProperty("ipd.price"));
	    Products.mbp.price = Double.valueOf(properties.getProperty("mbp.price"));
	    Products.vga.price = Double.valueOf(properties.getProperty("vga.price"));
	}
	
	

}
