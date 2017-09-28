package Test.Login;

import org.testng.annotations.Test;
import Test.TestBase;
import Utilities.GlobalVars;

public class LoginTest extends TestBase{

	@Test
	public void test1(){

		System.out.println(GlobalVars.BASE_URL);
		System.out.println(GlobalVars.LOGIN_URL);

	}

}
