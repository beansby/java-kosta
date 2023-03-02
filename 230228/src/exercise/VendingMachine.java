package exercise;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		// 1 : 커피 600원, 2 : 콜라 1100원, 3 : 사이다 1000원 
		Scanner sc = new Scanner(System.in);
		
		//선택, 넣은 돈 
		int menu, money, balance;
		int coin500 = 0, coin100 = 0, coin50 = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println("[자판기]");
			System.out.println(" 1. Coffee | 2. CocaCola | 3. Sprite ");
			System.out.println("    600원        1100원        1000원 ");
			System.out.print("선택 > ");
			menu = sc.nextInt();
			if(menu == 0) break;
			
			System.out.print("돈을 넣어주세요 > ");
			money = sc.nextInt();
			
			switch (menu) {
			case 1: balance = money - 600; 
					break;
			case 2: balance = money - 1100;
					break;
			case 3: balance = money - 1000;
					break;
			default: balance = money;
				 	break;
			}
			
			System.out.print("잔돈 : ");
			if(balance < 0) {
				System.out.print("돈이 부족합니다.");
			}
			
			coin500 = balance/500;
			balance = balance%500;
			coin100 = balance/100;
			balance = balance%100;
			coin50 = balance/50;
			
			
			if(coin500>0) {
				System.out.print("500원("+coin500+"개)");
			}
			if(coin100>0) {
				System.out.print("100원("+coin100+"개)");
			}
			if(coin50>0) {
				System.out.print("50원("+coin50+"개)");
			}
		
			System.out.println();
			System.out.println();
		}
		
	}

}
