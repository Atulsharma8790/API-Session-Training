package Test;

import org.testng.annotations.*;

import Utilities.Keywords;


public class TestBase{

	public static String env = System.getProperty("env");
	public static String ver = System.getProperty("ver");
	@BeforeSuite
	public void beforeSuite(){
		
		System.out.println("-----------------@BeforeSuite----------------");
		Keywords.setURL(env, ver);

	}


	@BeforeTest
	public void beforeTest(){

	}

	@AfterSuite
	public void afterSuite(){

	}

	@BeforeMethod
	public void beforeMethod(){

	}

	@AfterTest
	public void afterTest(){

	}

	@AfterMethod
	public void afterMethod(){

	}


}