package com.cart;

import java.util.ArrayList;
import java.util.List;

public class CartUtility {
    public static List<Cart> cartList=new ArrayList<>();

	public static void addProductToCart(Cart cart) {
		//1.Check if the cartList is already contains a cart object with the specific custid and productid
		//2.If yes then update the qty of the existing object with the qty choosen for the latest cart object.
		//3.If not then add the cart object to cartList.
		
		int index=-1;
		Cart temp=null;
		for(Cart c:cartList) {
			index++;
			if(c.getCustid().equals(cart.getCustid()) && c.getProductid().equals(cart.getProductid())) {
				temp=c;
				break;
			}
		}
		
		if(temp==null) {
			cartList.add(cart);
			System.out.println(" Cart Is Added....");
		} else {
			temp.setQuantity(temp.getQuantity()+cart.getQuantity());
			cartList.set(index, temp);
			System.out.println("Cart Updated....");
		}
		
	    //decrease the stock for the particular productid,that is added to cart.
		//we need to find the product object form the product list
		//based on the productid that is added to the cart.
		Product p=ProductUtility.findProduct(cart.getProductid());
		//we should then decrease the quantity on the the object p
		p.setQuantity(p.getQuantity()-cart.getQuantity());
		
	}
}
