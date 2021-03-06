package com.rk.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.rk.dao.ICategoryMasterDao;
import com.rk.model.CategoryMaster;

@Repository
public class CategoryMasterDaoImpl implements ICategoryMasterDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveCategoryMaster(CategoryMaster mst) {
		return (Integer) ht.save(mst);
	}

	@Override
	public List<CategoryMaster> getAllCategoryMaster() {
		List<CategoryMaster> list = ht.loadAll(CategoryMaster.class);
		return list;
	}

	@Override
	public void deleteCategoryMaster(Integer id) {
		CategoryMaster c = new CategoryMaster();
		c.setProductCategoryId(id);
		ht.delete(c);
	}

	@Override
	public CategoryMaster getOneCm(Integer id) {
		CategoryMaster c = ht.get(CategoryMaster.class, id);
		return c;
	}

	@Override
	public void updateCategoryMaster(CategoryMaster cm) {
		ht.update(cm);
	}

	
}
