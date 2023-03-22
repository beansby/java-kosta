package com.test04;

public class PlaneTest {
	public static void main(String[] args) {
		// Airplane과 Cargoplane 객체생성
		Airplane a = new Airplane("L777", 1000);
		Cargoplane c = new Cargoplane("C50", 1000);
		
        // 생성된 객체의 정보 출력
		System.out.println("Plane fuelSize");
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(c);
		
        // Airplane과 Cargoplane 객체에 100씩 운항
		System.out.println("100 운항");
		a.flight(100);
		c.flight(100);
		System.out.println();
		
	    // 운항후 객체의 변경된 정보 출력
		System.out.println("Plane fuelSize");
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(c);
		
		// Airplane과 Cargoplane 객체에 200씩 주유
		System.out.println("200 주유");
		a.refuel(200);
		c.refuel(200);
		System.out.println();
		
        // 주유후 객체의 변경된 정보 출력
		System.out.println("Plane fuelSize");
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(c);
		
	}
}
