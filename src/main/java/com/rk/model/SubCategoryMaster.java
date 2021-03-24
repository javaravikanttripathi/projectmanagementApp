package com.rk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubCategoryMaster {
	@Id
	@GeneratedValue
	@Column(name = "sub_cm_id")
	private Integer subCategoryMasterId;
	@Column(name = "prd_sc")
	private String productSubCatogory;
	@Column(name = "prod_desc")
	private String description;

	public Integer getSubCategoryMasterId() {
		return subCategoryMasterId;
	}

	public void setSubCategoryMasterId(Integer subCategoryMasterId) {
		this.subCategoryMasterId = subCategoryMasterId;
	}

	public String getProductSubCatogory() {
		return productSubCatogory;
	}

	public void setProductSubCatogory(String productSubCatogory) {
		this.productSubCatogory = productSubCatogory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SubCategoryMaster [subCategoryMasterId=" + subCategoryMasterId + ", productSubCatogory="
				+ productSubCatogory + ", description=" + description + "]";
	}
}
