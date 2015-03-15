package com.test.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class Calculator {
	
	@WebMethod
	public float addValue(float value){
		return (value+10);
	}
	

	@WebMethod
	public float substractValue(float value){
		return (value - 10);
	}
}
