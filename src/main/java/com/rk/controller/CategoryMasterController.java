package com.rk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rk.model.CategoryMaster;
import com.rk.service.ICategoryMasterService;

@Controller
@RequestMapping("/catmst")
public class CategoryMasterController {
	@Autowired
	private ICategoryMasterService service;

	@GetMapping("/show")
	public String showMasterPage() {
		return "DataAndRegister";
	}

	@PostMapping("/save")
	public String SaveCategoryMaster(@ModelAttribute CategoryMaster cm, ModelMap map) {
		Integer id = service.saveCategoryMaster(cm);
		List<CategoryMaster> list1 = service.getAllCategoryMaster();
		map.addAttribute("list", list1);
		return "DataAndRegister";
	}

	@GetMapping("/delete")
	public String deleteData(@RequestParam Integer id, ModelMap map) {
		service.deleteCategoryMaster(id);
		List<CategoryMaster> list1 = service.getAllCategoryMaster();
		map.addAttribute("list", list1);
		return "DataAndRegister";
	}

	@GetMapping("/edit")
	public String editPage(@RequestParam("id") Integer cId, ModelMap map) {
		CategoryMaster cm = service.getOneCm(cId);
		map.addAttribute("cm1", cm);
		return "EditCategory";
	}

	@PostMapping("/update")
	public String updatePage(@ModelAttribute CategoryMaster cm, ModelMap map) {
		service.updateCategoryMaster(cm);
		List<CategoryMaster> list1 = service.getAllCategoryMaster();
		map.addAttribute("list", list1);
		return "DataAndRegister";
	}

}
