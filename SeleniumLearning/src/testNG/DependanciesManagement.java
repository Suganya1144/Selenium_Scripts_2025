package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	//Problem 1: you have to admit a student to engineering college
	// Problem 2: you have to admit a student to Higher secondary
	
	//enabled = false is used for skipping a testcase
	
	@Test(enabled=true)// if false below methods won't execute 
	public void highschool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods ="highschool")
	public void HigherSecondary() {
		System.out.println("higher Secondary School");
	}
	@Test(dependsOnMethods = "HigherSecondary")
	public void Engineering() {
		System.out.println("College");
	}
	

}
