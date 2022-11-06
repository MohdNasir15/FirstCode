package nasir;

//package com.wstutorial.ws;

//   import .ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/ws/helloworld", new HelloWorldImpl());
		System.out.println("Service is running");
	}
}