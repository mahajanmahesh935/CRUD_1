package com.Category.Interfaces;

import java.util.List;

import com.Product_Management.Entity.category;

public interface category_controller {

	public List getcategorybyid(int id);

	public String addcategory(category c);

	public String updatecategory(category c);

	public String deletecategory(int id);

	public List getonlycategorys();

	public List getallcategorys();

	public List categoryOrder();

}
