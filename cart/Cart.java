package com.cart;

import java.util.Objects;

public class Cart {
private String custid;
private String productid;
private int price;
private int quantity;
public Cart() {
	super();
	// TODO Auto-generated constructor stub
}
public Cart(String custid, String productid, int price, int quantity) {
	super();
	this.custid = custid;
	this.productid = productid;
	this.price = price;
	this.quantity = quantity;
}
public String getCustid() {
	return custid;
}
public void setCustid(String custid) {
	this.custid = custid;
}
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity1() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public int hashCode() {
	return Objects.hash(custid, price, productid, quantity);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cart other = (Cart) obj;
	return Objects.equals(custid, other.custid) && price == other.price && Objects.equals(productid, other.productid)
			&& quantity == other.quantity;
}
public int getQuantity() {
	// TODO Auto-generated method stub
	return 0;
}


}
