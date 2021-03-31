package com.rk.service.iml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rk.dao.ISubCategoryMasterDao;
import com.rk.model.CategoryMaster;
import com.rk.model.SubCategoryMaster;
import com.rk.service.ISubCatagoryMasterService;

@Service
public class SubCategoryMasterServiceImpl implements ISubCatagoryMasterService {
	@Autowired
	private ISubCategoryMasterDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<String> getOneRecordOnlyCatagoryMaster() {
		return dao.getOneRecordOnlyCatagoryMaster();
	}

	@Override
	@Transactional(readOnly = true)
	public List<CategoryMaster> getAllCategoryMaster() {
		List<CategoryMaster> list = dao.getAllCategoryMaster();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public CategoryMaster getOneCategoryMaser(Integer id) {
		CategoryMaster cm = dao.getOneCategoryMaser(id);
		return cm;
	}

	@Override
	@Transactional
	public Integer saveSubCategory(SubCategoryMaster acm) {
		Integer id = dao.saveSubCategory(acm);
		return id;
	}
}
