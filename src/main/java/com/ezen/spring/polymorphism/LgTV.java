package com.ezen.spring.polymorphism;

public class LgTV implements TV {

		public void On() {
			System.out.println("LgTV ---- 전원 켜기");
		}
		
		public void Off() {
			System.out.println("LgTV ---- 전원 끄기");
		}
		
		public void Up() {
			System.out.println("LgTV ---- 소리 증가");
		}
		
		public void Down() {
			System.out.println("LgTV ---- 소리 감소");
		}
}
