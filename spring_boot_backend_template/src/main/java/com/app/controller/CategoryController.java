

















































//package com.app.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.app.dto.CategoryDTO;
//import com.app.service.CategoryService;
//
//@RestController
//@RequestMapping("/categories")
//public class CategoryController {
//
//	@Autowired
//	private CategoryService categorySerice;
//	
//	@PostMapping
//	public CategoryDTO addNewCategory(@RequestBody CategoryDTO dto)
//	{
//		System.out.println("in add new category");
//		return categorySerice.addNewCategory(dto);
//		
//	}
//}
