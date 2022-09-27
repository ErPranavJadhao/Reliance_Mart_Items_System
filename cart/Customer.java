package com.cart;

import java.util.Objects;

public class Customer {
	private String custid;
	private String custname;
	private String city;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String custid, String custname, String city) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.city = city;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, custid, custname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(city, other.city) && Objects.equals(custid, other.custid)
				&& Objects.equals(custname, other.custname);
	}
	

}
