package com.crm.contact;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(groups="smoke")
	
	public void ContactCreate()
	{
		Reporter.log("contact created",true);
	}
	@Test(groups="regression")
	public void DeleteCreate()
	{
		Reporter.log("contact deleted",true);
	}
	}
