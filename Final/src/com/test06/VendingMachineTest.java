package com.test06;

import java.rmi.dgc.VMID;
import java.util.Scanner;

import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineTest {
	public static void main(String[] args) throws Exception {
		//사용자 입력 
		Scanner sc = new Scanner(System.in);
		VendingMachineBiz vm = new VendingMachineBiz();
		Drink[] drinkList = new Drink[3];
		drinkList[0] = new Coffee();
		drinkList[1] = new Coke();
		drinkList[2] = new Juice();
		
		
		while(true) {
			printMenu();
			try {
				int num = Integer.parseInt(sc.nextLine());
				if(num == 9) {System.out.println("프로그램 종료"); break;}
				
				switch (num) {
				case 1: vm.prinkDrinkList(drinkList);
					break;
				case 2: vm.cartDrink(new Juice());
					break;
				case 3: vm.cartDrink(new Coffee());
					break;
				case 4: vm.cartDrink(new Coke());
					break;
				case 5: vm.printCart();
					break;

				default:
					throw new Exception("메뉴값을 확인 후 다시 입력하세요.");
				}
				System.out.println();
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력 형식입니다. 숫자를 입력해주세요.");
				System.out.println();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println();
			}
			
			
					
		}
	}
	
	/**
	 * 메뉴 출력. 
	 */
	static void printMenu() {
		System.out.println("============================");
		System.out.println("[음료수 자판기 관리 시스템]");
		System.out.println("============================");
		System.out.println("1.전체 음료수 및 잔액 보기 \n"
						+ "2.쥬스 구입하기 ( 200원 )\n"
						+ "3.커피 구입하기 ( 100원 )\n"
						+ "4.코크 구입하기 ( 50원 )\n"
						+ "5.구입한 음료수 목록 보기\n"
						+ "9.종료");
		System.out.println();
		System.out.println("============================");
		System.out.print("메뉴 입력 => ");
	}
	
	
}
