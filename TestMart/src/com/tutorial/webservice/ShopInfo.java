package com.tutorial.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.tutorial.webservice.exception.InvalidInputException;

@WebService
@SOAPBinding(style=Style.RPC,use=Use.LITERAL)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput") String property) throws InvalidInputException{
		String response = null;
		if("shopname".equals(property)){
			response="Test Mart";
		}
		else if("since".equals(property)){
			response="2007";
		}
		else{
			throw new InvalidInputException("Invalid Inputs", property+" is not valid");
		}
		return response;
	}

}
