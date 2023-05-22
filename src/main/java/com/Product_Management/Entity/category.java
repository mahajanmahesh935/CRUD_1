package com.Product_Management.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class category {

	@Id
	int category_id;
	String category_name;
	int order_id;
	int product_id;
	

	public category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public category(int category_id, String category_name, int order_id, int product_id) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.order_id = order_id;
		this.product_id = product_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	@Override
	public String toString() {
		return "category [category_id=" + category_id + ", category_name=" + category_name +
				", order_id=" + order_id + ", product_id=" + product_id + "]";
	}

}
