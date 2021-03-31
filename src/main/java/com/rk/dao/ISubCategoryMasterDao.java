package com.rk.dao;

import java.util.List;

import com.rk.model.CategoryMaster;
import com.rk.model.SubCategoryMaster;

public interface ISubCategoryMasterDao {
	public List<String> getOneRecordOnlyCatagoryMaster();

	public List<CategoryMaster> getAllCategoryMaster();

	public CategoryMaster getOneCategoryMaser(Integer id);
	public Integer saveSubCategory(SubCategoryMaster acm);

}
