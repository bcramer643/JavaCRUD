package com.mars.springjdbc.model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Customer {

	private String customer_name;
	private String city;
	private int customer_id;
	private int grade;
	private int salesman_id;
	
	
	public String getCustomer_name() {
		return customer_name;
	}
	
	public void setCustomerName(String customer_name) {
		// TODO Auto-generated method stub
		this.customer_name = customer_name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}
	
	@Override
	public String toString() {
		return "Customer [customer_name=" + customer_name + ", city=" + city + ", customer_id=" + customer_id
				+ ", grade=" + grade + ", salesman_id=" + salesman_id + "]";
	}


	
	
}
