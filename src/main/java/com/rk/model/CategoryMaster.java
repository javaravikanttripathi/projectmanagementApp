package com.rk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CategoryMaster {
	@GeneratedValue
	@Id
	@Column(name = "prd_cat_id")
	private Integer productCategoryId;
	@Column(name = "prd_cat")
	private String productCategory;
	@Column(name = "prd_cat_desc")
	private String productCategooryDescription;
	@OneToMany
	@JoinColumn(name = "cmfk")
	private List<SubCategoryMaster> scmObj;

	public Integer getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductCategooryDescription() {
		return productCategooryDescription;
	}

	public void setProductCategooryDescription(String productCategooryDescription) {
		this.productCategooryDescription = productCategooryDescription;
	}

	public List<SubCategoryMaster> getScmObj() {
		return scmObj;
	}

	public void setScmObj(List<SubCategoryMaster> scmObj) {
		this.scmObj = scmObj;
	}

}
