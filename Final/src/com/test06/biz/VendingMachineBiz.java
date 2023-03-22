package com.test06.biz;

import java.util.Arrays;
import java.util.function.BiConsumer;

import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineBiz implements IVendingMachineBiz {
	int balance = 1000; //현재 잔액 
	Drink[] cartList = new Drink[3]; //구입목록 배열
	int count = 0; //배열 갯수 

	/**
	 * 음료수 구매 로직 구현.
	 * @throws Exception 
	 */
	@Override
	public void cartDrink(Drink drink) throws Exception {
		/* 1) 현재 잔액을 출력한다. ( Sample Run 참조 ) 
		 * 2) 매개변수로 넘겨받은 Drink 타입에 대한 메시지를 출력한다. (실행결과 참조)       
		 * 메시지 출력시 Drink 타입의 toString() 메소드를 사용한다.
		 * 3) 잔액과 구매가격을 비교하여 부족한 경우에 에러 메시지를 출력한다.
		 * 4) 현재 갖고 있는 잔액에서 구매가격만큼 뺀다.
		 * 5) 배열에 저장된 개수와 배열의 크기가 같으면, 기존의 배열보다 사이즈가 
		 * 3배인 배열을 생성한 후, 기존의 배열 내용을 새로운 배열에 복사하고 새로운 배열과 기존 배열을 바꾼다.
		 * 6) 배열에 구매한 개수만큼 저장하고 count값을 증가시킨다.
		 */
		
		//잔액 부족 
		if(getBalance() < drink.getPrice()) {
			throw new Exception("잔액이 부족하여 "+ drink.getClass().getSimpleName() +" 구매 불가능합니다.");
		}
		setBalance(getBalance()-drink.getPrice());
		
		//배열 길이 부족 
		if(count == cartList.length) {
			Drink[] newArr = new Drink[cartList.length *3];
			System.arraycopy(cartList, 0, newArr, 0, count);
			System.out.println(newArr.length);
			 
			Drink[] temp = newArr;
			newArr = cartList;
			cartList = temp;
		}
		cartList[count++] = drink;
		
		System.out.print(drink.toString());
		System.out.println(" 현재 잔액: "+ getBalance() +"원");
		
	}

	/**
	 * 구매 목록 배열 저장 정보 출력.
	 */
	@Override
	public void printCart() {
		/*
		 * 1) 배열에 저장된 데이터 타입에 따른 개수를 count한다. 
		 * 2) 배열에 저장된 총 구매금액을 계산한다.
		 * 3) 구매목록과 남은 잔액을 출력한다.( 실행결과 참조 ) 
		 */
		
		int coffee = 0, juice = 0, coke = 0;
		int total = 0;	//총 구매금액 
		
		for(int i=0; i<cartList.length; i++) {
			if(cartList[i] instanceof Coffee) {
				coffee++;
				total += cartList[i].getPrice();
			} else if (cartList[i] instanceof Juice) {
				juice++;
				total += cartList[i].getPrice();
			} else if (cartList[i] instanceof Coke) {
				coke++;
				total += cartList[i].getPrice();
			}
		}
		
		System.out.println("=====음료수 구입 목록=====");
		System.out.println("쥬스 : "+ juice +" 개");
		System.out.println("커피 : "+ coffee +" 개");
		System.out.println("코크 : "+ coke +" 개");
		System.out.println("======================");
		System.out.println("사용 금액: "+total+" 원");
		System.out.println("남은 금액: "+getBalance()+" 원");
	}

	/**
	 * 음료수 자판기 내 모든 음료수 출력.
	 */
	@Override
	public void prinkDrinkList(Drink[] drinkList) {
		 /*
		  * 1) drinkList 배열에 저장된 내용을 출력한다. ( 실행결과 참조 )
		  * 음료수명은 한글로 출력한다. ( 예: 커피, 코크, 주스 )
		  * 2) 마지막에는 잔액을 출력한다. ( 실행결과  참조 )
		  */
		
		System.out.println("===============");
		System.out.println("음료수명    가격");
		System.out.println("===============");
		
		for(int i=0; i<drinkList.length; i++) {
			if(drinkList[i] instanceof Coffee) {
				System.out.print("커피 \t" +drinkList[i].getPrice()+ "원");
			} else if (drinkList[i] instanceof Coke) {
				System.out.print("코크 \t" +drinkList[i].getPrice()+ "원");
			} else if (drinkList[i] instanceof Juice) {
				System.out.print("주스 \t" +drinkList[i].getPrice()+ "원");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("현재 잔액: "+balance+" 원");
		
		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
