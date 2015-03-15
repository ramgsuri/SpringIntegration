package com.test.ws.endpoint;

import javax.xml.ws.Endpoint;

import com.test.ws.Calculator;

public class CalcEndpoint {
   public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/TestWebService/services/Calculator",new Calculator());
  }
 
}
