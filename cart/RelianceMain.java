package com.cart;

import java.util.Scanner;

public class RelianceMain {
	public static Scanner scan=new Scanner(System.in);
	public static Customer customer=null;
	public static String productid="";
	public static int quantity=0;
public static void main(String[] args) {
	int choice=0;
	do {
		//here we need to display the product item list
		showProduct();
		System.out.println();
		System.out.println("1.Add Product To Cart");
		System.out.println("2.View Cart Items");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.println("Enter Your Choice");
		choice=scan.nextInt();
		switch(choice) {
		case 1:
			/*
			 #1 We need to collect the customer details such as custid,name,city.
			 #2 We should again display the products list from which the customer can choose.
			 #3 We need to read the product details such as product id,quantity that need to be added to the cart.
			 #4 We need to create a cart object and the add it to cartlist.
			 */
			if(customer==null) {
			readCustomerDetails();
			}
			showProduct();
			readProductDetails();
			createCartAndAddToCartList();
			break;
		case 2:
			viewCartItems();
			break;
		case 3:
			deleteCart();
			break;
		default:
			System.out.println("Thank You!!!!!");
		}
	} while(choice<4);
} 
private static void createCartAndAddToCartList() {
	Cart cart=new Cart(customer.getCustid(),productid,ProductUtility.getProductPrice(productid),quantity);
	CartUtility.addProductToCart(cart);
}
private static void readProductDetails() {
	System.out.println("Enter the product id");
	productid=scan.next();
	System.out.println("Enter the quantity");
	quantity=scan.nextInt();
}
private static void readCustomerDetails() {
	customer=new Customer();
	String custid="";
	String custname="";
	String city="";
	System.out.println("Enter cust id");
	custid=scan.next();
	System.out.println("Enter cust name");
	custname=scan.next();
	System.out.println("Enter city");
	city=scan.next();
	
}
private static void deleteCart() {
	System.out.println("Delete Cart code here.........");
	
}
private static void viewCartItems() {
    System.out.println("View Cart Items......");
	
}
public static void addProductToCart() {
	System.out.println("Add Product To Cart");
	
}
public static void showProduct() {
	System.out.printf("%-8s%-15s%-8s%-20s%-8s", "PROD-ID","PRODUCT-NAME","PRICE","CATEGORY","STOCK");
	System.out.println();
	System.out.println("----------------------------------------------------------");
	for(Product p: ProductUtility.productList) {
		System.out.printf("%-8s%-15s%-10s%-20s%-8d", p.getProductid(),p.getProductname(),"Rs"+p.getPrice(),p.getCategory(),p.getQuantity());
		System.out.println();
	}
}
}
