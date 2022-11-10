package com.ezen.spring.polymorphism;

public class SamsungTV implements TV{
	
	public void On() {
		System.out.println("SamsungTV ---- 전원 켜기");
	}
	
	public void Off() {
		System.out.println("SamsungTV ---- 전원 끄기");
	}
	
	public void Up() {
		System.out.println("SamsungTV ---- 소리 증가");
	}
	
	public void Down() {
		System.out.println("SamsungTV ---- 소리 감소");
	}

}
