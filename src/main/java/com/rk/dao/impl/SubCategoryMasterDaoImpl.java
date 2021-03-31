package com.rk.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.rk.dao.ISubCategoryMasterDao;
import com.rk.model.CategoryMaster;
import com.rk.model.SubCategoryMaster;

@Repository
public class SubCategoryMasterDaoImpl implements ISubCategoryMasterDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public List<String> getOneRecordOnlyCatagoryMaster() {
		String query = "SELECT productCategory FROM com.rk.model.CategoryMaster";
		List<String> list = (List<String>) ht.find(query);
		return list;
	}

	@Override
	public List<CategoryMaster> getAllCategoryMaster() {
		List<CategoryMaster> list = ht.loadAll(CategoryMaster.class);
		return list;
	}

	@Override
	public CategoryMaster getOneCategoryMaser(Integer id) {
		CategoryMaster ct = ht.get(CategoryMaster.class, id);
		return ct;
	}

	@Override
	public Integer saveSubCategory(SubCategoryMaster acm) {
		Integer id = (Integer) ht.save(acm);
		return id;
	}
}
