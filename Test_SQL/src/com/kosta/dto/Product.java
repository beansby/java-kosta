package com.kosta.dto;

public class Product {
	//제품 카테고리 BOOK, COMPUTER, ETC
	public final static String CATE_BOOK="BOOK";
	public final static String CATE_COMPUTER="COMPUTER";
	public final static String CATE_ETC="ETC";
	
	//제품 코드
	private String code;
	//제품 이름
	private String name;
	//제품 가격
	private Integer price;
	//제품 수량
	private Integer stock;
	//제품 종류
	private String category;
	
	//생성자 정의		
	public Product(String code, String name, Integer price, Integer stock, String category) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.category = category;
	}
	public Product(String name, Integer price, Integer stock, String category) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.category = category;
	}
	
	//Setter, Getter
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	//toString overriding
	@Override
	public String toString() {
		return "상품 정보: 코드-"+code+", "+name+", 가격-"+price+"원, 재고-"+stock+"개";
	}	
}
