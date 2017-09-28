package Request.Login;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import Request.IRequest;
import Utilities.GlobalVars;

public class Login_v1 implements IRequest{

	private String sid;
	private String pwd;

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public void setFields() {

		this.setSid(GlobalVars.USERNAME);
		this.setPwd(GlobalVars.PASSWORD);

	}



	public Response sendRequest() {

		RestAssured.baseURI=GlobalVars.BASE_URL+GlobalVars.LOGIN_URL;

		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(this)
				.when()
				.post();


		System.out.println(response);
		return response;
	}




}
