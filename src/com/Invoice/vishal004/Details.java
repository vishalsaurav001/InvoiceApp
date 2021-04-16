package com.Invoice.vishal004;

public class Details {
	
	private int coustmerId;
	private String coustmername;
	private String mobile;
	private String address;
	private String productName;
	private Double productPrice;
	private Double quantity;
	private Double totalPrice;
	private String paymentMethod;
	private Double totalPayment;
	
	

	public int getCoustmerId() {
		return coustmerId;
	}
	public void setCoustmerId(int coustmerId) {
		this.coustmerId = coustmerId;
	}
	public String getCoustmername() {
		return coustmername;
	}
	public void setCoustmername(String coustmername) {
		this.coustmername = coustmername;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getaddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Double getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(Double totalPayment) {
		this.totalPayment = totalPayment;
	}
	
	public Details(int coustmerId, String coustmername, String mobile, String address , String productName, Double productPrice,
			Double quantity, Double totalPrice, String paymentMethod, Double totalPayment) {
		super();
		this.coustmerId = coustmerId;
		this.coustmername = coustmername;
		this.mobile = mobile;
		this.address = address;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.paymentMethod = paymentMethod;
		this.totalPayment = totalPayment;
	}
	public Details(String coustmername, String mobile, String address, String productName, Double productPrice, Double quantity,
			Double totalPrice, String paymentMethod, Double totalPayment) {
		super();
		this.coustmername = coustmername;
		this.mobile = mobile;
		this.address = address;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.paymentMethod = paymentMethod;
		this.totalPayment = totalPayment;
	}
	@Override
	public String toString() {
		return "Details [coustmerId=" + coustmerId + ", coustmername=" + coustmername + ", mobile=" + mobile
				+ ", address=" + address + ", productName=" + productName + ", productPrice=" + productPrice + ", quantity=" + quantity
				+ ", totalPrice=" + totalPrice + ", paymentMethod=" + paymentMethod + ", totalPayment=" + totalPayment
				+ "]";
	}
	
}
