package com.crm.product;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateProductTest {
	@Test(groups="smoke")
	public void createProduct()
	{
		Reporter.log("product created");
	}
	

}
