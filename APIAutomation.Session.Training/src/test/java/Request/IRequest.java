package Request;

import com.jayway.restassured.response.Response;

public interface IRequest {

	public void setFields();
	public Response sendRequest();

}
