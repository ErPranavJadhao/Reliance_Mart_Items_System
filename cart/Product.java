package com.cart;
import java.util.Objects;



public class Product {
private String productid;
private String productname;
private String category;
private int price;
private int quantity;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String productid, String productname, String category, int price, int quantity) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.category = category;
	this.price = price;
	this.quantity = quantity;
}
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public int hashCode() {
	return Objects.hash(category, price, productid, productname, quantity);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return Objects.equals(category, other.category) && price == other.price
			&& Objects.equals(productid, other.productid) && Objects.equals(productname, other.productname)
			&& quantity == other.quantity;
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", productname=" + productname + ", category=" + category + ", price="
			+ price + ", quantity=" + quantity + "]";
}

} 
