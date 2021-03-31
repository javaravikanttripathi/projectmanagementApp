package com.rk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rk.model.CategoryCommand;
import com.rk.model.CategoryMaster;
import com.rk.model.SubCategoryMaster;
import com.rk.service.ISubCatagoryMasterService;

@Controller
@RequestMapping("/subcatmst")
public class SubCategoryMasterController {
	@Autowired
	private ISubCatagoryMasterService service;

	@GetMapping("/show")
	public String getMultiObject(ModelMap map) {
		List<CategoryMaster> list1 = service.getAllCategoryMaster();
		map.addAttribute("list", list1);
		return "SubCategoryMaster";
	}

	@PostMapping("/save")
	public String editAndUpdateChilTab(@ModelAttribute SubCategoryMaster scm, ModelMap map) {
		List<CategoryMaster> list1 = service.getAllCategoryMaster();
		Integer id = service.saveSubCategory(scm);
		map.addAttribute("list", list1);
		String data = "SubCategoryMaser Save   " + id + "   Successfully";
		map.addAttribute("data1", data);
		return "SubCategoryMaster";
	}

	@GetMapping("/catcmd")
	public String getCatagoryCommand(@ModelAttribute CategoryCommand cmd, ModelMap map) {
		List<CategoryMaster> list1 = service.getAllCategoryMaster();
		map.addAttribute("scm", cmd);
		map.addAttribute("list", list1);
		return "SubCategoryMasterPage";
	}
}
