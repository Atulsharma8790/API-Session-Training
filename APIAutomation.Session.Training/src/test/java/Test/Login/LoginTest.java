package Test.Login;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import Request.IRequest;
import RequestFactory.RequestFactory;
import Test.TestBase;
import Utilities.GlobalVars;

public class LoginTest extends TestBase{

	@Test
	public void test1(){

		System.out.println(GlobalVars.BASE_URL);
		System.out.println(GlobalVars.LOGIN_URL);

	}
	
	@Test
	public void testLogin(){
		IRequest iRequest = RequestFactory.createRequest("Request.Login.Login_", ver);
		iRequest.setFields();
		
		Response response = iRequest.sendRequest();
	}

}
