package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String SellerName;
	private Double Sum;
	
	public SaleSumDto() {}

	public SaleSumDto(Seller seller, Double sum) {
		SellerName = seller.getName();
		Sum = sum;
	}

	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}

	public Double getSum() {
		return Sum;
	}

	public void setSum(Double sum) {
		Sum = sum;
	}
	
	
}
