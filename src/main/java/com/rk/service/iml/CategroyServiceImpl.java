package com.rk.service.iml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rk.dao.ICategorymasterDao;
import com.rk.model.CategoryMaster;
import com.rk.service.ICategoryService;

@Service
public class CategroyServiceImpl implements ICategoryService {
	@Autowired
	private ICategorymasterDao dao;

	@Override
	@Transactional
	public Integer saveCategoryMaster(CategoryMaster mst) {
		return dao.saveCategoryMaster(mst);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CategoryMaster> getAllCategoryMaster() {
		return dao.getAllCategoryMaster();
	}

	@Override
	@Transactional
	public void deleteCategoryMaster(Integer id) {
		dao.deleteCategoryMaster(id);

	}

	@Override
	@Transactional(readOnly = true)
	public CategoryMaster getOneCm(Integer id) {
		CategoryMaster c = dao.getOneCm(id);
		return c;
	}

	@Override
	@Transactional
	public void updateCategoryMaster(CategoryMaster cm) {
		dao.updateCategoryMaster(cm);
	}

	@Override
	@Transactional(readOnly = true)
	public List<String> getOneRecordOnlyCatagoryMaster() {
		return dao.getOneRecordOnlyCatagoryMaster();
	}

}
