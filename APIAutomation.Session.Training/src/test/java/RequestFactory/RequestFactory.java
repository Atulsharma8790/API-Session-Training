package RequestFactory;

import Request.IRequest;

public class RequestFactory {

	/**
	 * Class Definition: Factory
	 * Return: 
	 */
	public static IRequest createRequest(String requestType, String version){
		try{
			IRequest iRequest =  (IRequest)Class.forName(requestType+version).newInstance();

			return iRequest;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}	
}


