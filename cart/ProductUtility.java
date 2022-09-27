package com.cart;

import java.util.ArrayList;
import java.util.List;

public class ProductUtility {
     
	public static List<Product> productList=new ArrayList<>();
	
	static{
		productList.add(new Product("A101","Milk","DailyProducts",60,1500));
		productList.add(new Product("A102","LG 2Ton AC","Air Conditioner",49999,65));
		productList.add(new Product("A103","Vivobook","Laptop",32000,25));
		productList.add(new Product("A104","DellG15","Laptop",125000,15));
		productList.add(new Product("A105","Headphone","Gadget",12500,55));
		productList.add(new Product("A106","Siri","Gadget",12500,105));
	}
	
	public static String getProductName(String productid) {
		String productname="";
		for(Product p : productList) {
			if(p.getProductid().equals(productid)) {
				productname=p.getProductname();
				break;
			}
		}
		return productname;
	}
	public static int getProductPrice(String productid) {
		int price=0;
		for(Product p : productList) {
			if(p.getProductid().equals(productid)) {
				price=p.getPrice();
				break;
			}
		}
		return price;
	}
	public static Product findProduct(String productid) {
		// TODO Auto-generated method stub
		return null;
	}


}
