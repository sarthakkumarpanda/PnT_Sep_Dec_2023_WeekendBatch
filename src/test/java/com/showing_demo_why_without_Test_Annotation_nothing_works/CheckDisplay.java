package com.showing_demo_why_without_Test_Annotation_nothing_works;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckDisplay {
	
	@BeforeMethod
	public void begin() {
		System.out.println("This is BM");
	}

	
	@Test
	public void someLogic() {
		System.out.println("Something");
	}
}
