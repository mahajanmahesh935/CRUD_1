package com.Product_Management.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Category.Interfaces.category_controller;
import com.Product_Management.Entity.category;
import com.Product_Management.Service.Category_Service;

@RequestMapping("api")
@RestController
public class Category_Controller implements category_controller {

	@Autowired
	Category_Service service;

//	Get category By Id
	@Override
	@GetMapping("/categories/{id}")
	public List getcategorybyid(@PathVariable int id) {
		return service.getcategorybyid(id);
	}

//	Add New category
	@Override
	@PostMapping("category/add")
	public String addcategory(@RequestBody category c) {
		return service.addcategory(c);
	}

//	Update Existing category
	@Override
	@PutMapping("/category/update/{id}")
	public String updatecategory(@RequestBody category c) {
		return service.updatecategory(c);
	}

//	Delete category BY Id
	@Override
	@DeleteMapping("/category/delete/{id}")
	public String deletecategory(@PathVariable int id) {
		return service.deletecategory(id);
	}

//	Get All categorys List
	@Override
	@GetMapping("/categories/getall")
	public List getonlycategorys() {
		return service.getonlycategorys();
	}

//	Get All List With category And Products
	@Override
	@GetMapping("/categories/list")
	public List<category> getallcategorys() {
		return service.getallcategorys();
	}

//	Get All Orders
	@Override
	@GetMapping("orders")
	public List categoryOrder() {
		return service.categoryOrder();
	}



}
