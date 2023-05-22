package com.Category.Interfaces;

import java.util.List;

import com.Product_Management.Entity.category;

public interface category_dao {

	public List getcategorybyid(int id);

	public String addcategory(category c);

	public String updatecategorys(category c);

	public String deletecategorybyid(int id);

	public List getonlycategorys();

	public List getallcategorys();

	public List categoryOrder();



}
