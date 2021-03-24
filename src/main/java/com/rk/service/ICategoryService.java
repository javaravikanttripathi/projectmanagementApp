package com.rk.service;

import java.util.List;

import com.rk.model.CategoryMaster;

public interface ICategoryService {
	public Integer saveCategoryMaster(CategoryMaster mst);

	public List<CategoryMaster> getAllCategoryMaster();

	public void deleteCategoryMaster(Integer id);

	public CategoryMaster getOneCm(Integer id);

	public void updateCategoryMaster(CategoryMaster cm);

	public List<String> getOneRecordOnlyCatagoryMaster();
}
