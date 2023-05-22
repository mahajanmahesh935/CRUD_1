package com.Product_Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Category.Interfaces.category_service;
import com.Product_Management.Entity.category;
import com.Product_Management.Repository.Category_Dao;

@Service
public class Category_Service implements category_service {

	@Autowired
	Category_Dao dao;

	@Override
	public List getcategorybyid(int id) {
		return dao.getcategorybyid(id);
	}

	@Override
	public String addcategory(category c) {
		return dao.addcategory(c);
	}

	@Override
	public String updatecategory(category c) {
		return dao.updatecategorys(c);
	}

	@Override
	public String deletecategory(int id) {
		return dao.deletecategorybyid(id);
	}

	@Override
	public List getonlycategorys() {
		return dao.getonlycategorys();
	}

	@Override
	public List<category> getallcategorys() {
		return dao.getallcategorys();
	}

	@Override
	public List categoryOrder() {
		return dao.categoryOrder();
	}

}
