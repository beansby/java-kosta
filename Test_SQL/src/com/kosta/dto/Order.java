package com.kosta.dto;

public class Order {
	//주문 번호
	private Integer no;
	//주문 고객명
	private String customer;
	//주문 상품
	private String productCode;
	//주문 수량
	private Integer amount;
	//주문 취소 여부
	private Boolean canceled;	
	
	//생성자 정의	
	public Order(Integer no, String customer, String productCode, Integer amount, Boolean canceled) {
		this.no = no;
		this.customer = customer;
		this.productCode = productCode;
		this.amount = amount;
		this.canceled = canceled;
	}
	public Order(String customer, String productCode, Integer amount) {
		this.customer = customer;
		this.productCode = productCode;
		this.amount = amount;
	}

	//Setter, Getter
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Boolean getCanceled() {
		return canceled;
	}
	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}
	//toString override
	public String toString() {
		return "주문 정보: 주문번호-"+no+", 주문고객명-"+customer+", 주문상품-"+productCode+", 주문수량-"+amount+", 취소여부-"+(!canceled?"정상":"취소");
	}
}
