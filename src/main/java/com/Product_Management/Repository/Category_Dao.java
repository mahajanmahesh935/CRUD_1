package com.Product_Management.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Category.Interfaces.category_dao;
import com.Product_Management.Entity.category;

@Repository
public class Category_Dao implements category_dao {
	
	
	@Autowired
    private SessionFactory fact;

//	Add New category
	@Override
	public String addcategory(category c) {
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		session.save(c);
		tr.commit();
		return "Added category SuccesFully";
	}

//	Update category By Id
	@Override
	public String updatecategorys(category c) {
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		session.update(c);
		tr.commit();
		return "Updated category SuccesFully";
	}

//	Delete category By Id
	@Override
	public String deletecategorybyid(int id) {
		Session session = fact.openSession();
		category c = session.load(category.class, id);
		Transaction tr = session.beginTransaction();
		session.delete(c);
		tr.commit();
		return "Deleted category SuccesFully";
	}

//	Get category By Id
	@Override
	public List getcategorybyid(int id) {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createNativeQuery("select category.category_id,category.category_name,product.product_id,product.product_name,product.product_price,category.order_id from category,product where category.product_id=product.product_id and category.category_id=:a");
		query.setParameter("a", id);
		List<Object[]> list1 = query.list();
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for (Object[] object : list1) {
			LinkedHashMap<String, Object> map = new LinkedHashMap<>();
			map.put("category_id", object[0]);
			map.put("category_name", object[1]);
			map.put("product_id", object[2]);
			map.put("product_name", object[3]);
			map.put("product_price", object[4]);
			map.put("order_id", object[5]);
			list.add(map);
		}
		return list;
	}

//	Get Only categorys
	@Override
	public List getonlycategorys() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createNativeQuery("select category.category_id,category.category_name from category");
		List<Object[]> list1 = query.list();
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for (Object[] object : list1) {
			LinkedHashMap<String, Object> map = new LinkedHashMap<>();
			map.put("category_id", object[0]);
			map.put("category_name", object[1]);
			list.add(map);
		}
		return list;
	}

//	Get All categorys
	@Override
	public List getallcategorys() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createNativeQuery("select category.category_id,category.category_name,product.product_id,product.product_name,product.product_price,category.order_id from category ,product where category.product_id=product.product_id");
		List<Object[]> list1 = query.list();
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for (Object[] object : list1) {
			LinkedHashMap<String, Object> map = new LinkedHashMap<>();
			map.put("category_id", object[0]);
			map.put("category_name", object[1]);
			map.put("product_id", object[2]);
			map.put("product_name", object[3]);
			map.put("product_price", object[4]);
			map.put("order_id", object[5]);
			list.add(map);
		}
		return list;
	}

//	category Orders List
	@Override
	public List categoryOrder() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createNativeQuery("select category.category_id,category.product_id,product.product_price,category.order_id from category,product where category.product_id=product.product_id");
		List<Object[]> list1 = query.list();
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for (Object[] object : list1) {
			LinkedHashMap<String, Object> map = new LinkedHashMap<>();
			map.put("category_id", object[0]);
			map.put("product_id", object[1]);
			map.put("product_price", object[2]);
			map.put("order_id", object[3]);
			list.add(map);
		}
		return list;
	}

}
