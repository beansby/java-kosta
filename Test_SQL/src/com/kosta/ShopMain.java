package com.kosta;

import com.kosta.dto.Order;
import com.kosta.dto.Product;

public class ShopMain {

	public static void main(String[] args) {
		//1. Shop 객체 생성 및 변수 초기화
		Shop shop= new Shop();
		
		//2. 상품 추가
//		shop.addProduct(new Product("마우스", 15000, 30, Product.CATE_COMPUTER)); // 상품코드: P-1
//		shop.addProduct(new Product("자바의 정석", 38000, 50, Product.CATE_BOOK)); // 상품코드: P-2
//		shop.addProduct(new Product("볼펜", 2900, 100, Product.CATE_ETC));	    // 상품코드: P-3
//		shop.addProduct(new Product("키보드", 51000, 75, Product.CATE_COMPUTER)); // 상품코드: P-4
		
		//3. 주문 추가:
//		shop.order(new Order("홍길동", "P-1", 2));	//주문번호, 고객명, 상품, 수량, 취소여부 //고객명,상품코, 수량
//		//4. 상품 정보 조회
		Product p1 = shop.findProductByCode("P-1");
//		//5. 상품 정보 출력
		System.out.println(p1);//상품 정보: 코드-P-1, 마우스, 가격-15000원, 재고-28개
//		
//		//3. 주문 추가
//		shop.order(new Order("홍길동", "P-3", 10));
//		//4. 상품 정보 조회
//		Product p2 = shop.findProductByCode("P-3");
//		//5. 상품 정보 출력
//		System.out.println(p2);//상품 정보: 코드-P-3, 볼펜, 가격-2900원, 재고-90개
//		
//		//3. 주문 추가
//		int orderNo = shop.order(new Order("홍길동", "P-3", 5));//orderNo = 3
//		//4. 상품 정보 조회
//		Product p3 = shop.findProductByCode("P-3");
//		//5. 상품 정보 출력
//		System.out.println(p3);//상품 정보: 코드-P-3, 볼펜, 가격-2900원, 재고-85개
		
		System.out.println("------------전체 상품 정보 출력 시작------------");
		//6. 전체 상품 정보 출력
		shop.printAllProductInfo();
		System.out.println("------------전체 상품 정보 출력 종료------------");
		
		System.out.println("------------전체 주문 정보 출력 시작------------");
		//7. 전체 주문 정보 출력
		shop.printAllOrderInfo();
		System.out.println("------------전체 주문 정보 출력 종료------------");
		
		//8-1. 주문 정보 조회
		Order order = shop.findOrderByNo(3);	//orderNo = 3
		//8-2. 주문 정보 출력
		System.out.println(order);//주문 정보: 주문번호-3, 주문고객명-홍길동, 주문상품-P-3, 주문수량-5, 취소여부-정상
		
		//9. 주문 취소
		Order canceledOrder = shop.cancelOrder(3); //orderNo = 3
		System.out.println(canceledOrder);//주문 정보: 주문번호-3, 주문고객명-홍길동, 주문상품-P-3, 주문수량-5, 취소여부-취소
//		
//		//10. 주문 내역: 고객명(홍길동)과 취소여부(정상) 정보를 이용한 조회
//		//홍길동님의 정상주문 건수는: 2건이고,정상주문합계금액은: 59000원 입니다.
//		shop.printOrderDetailsByCustomerAndIsCanceled("홍길동", "정상");
//		
//		//10. 주문 내역: 고객명(홍길동)과 취소여부(취소) 정보를 이용한 조회
//		//홍길동님의 취소주문 건수는: 1건이고,취소주문합계금액은: 14500원 입니다.
//		shop.printOrderDetailsByCustomerAndIsCanceled("홍길동", "취소");
	}

}
