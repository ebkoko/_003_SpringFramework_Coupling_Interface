package com.ezen.spring.polymorphism;

public class TvUser {

	public static void main(String[] args) {
		TV tv;
		tv = new SamsungTV();
		tv.On();
		tv.Up();
		tv.Down();
		tv.Off();
		System.out.println("------------------------");
		
		tv = new LgTV();
		tv.On();
		tv.Up();
		tv.Down();
		tv.Off();
	}

}
