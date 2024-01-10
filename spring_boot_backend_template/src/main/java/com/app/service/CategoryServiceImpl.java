








































//package com.app.service;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.app.dao.CategoryDao;
//import com.app.dao.ProductDao;
//import com.app.dto.CategoryDTO;
//import com.app.entities.Category;
//
//@Service
//@Transactional
//public class CategoryServiceImpl implements CategoryService {
//
//	@Autowired
//	private CategoryDao catDao;
//
//	@Autowired
//	private ModelMapper mapper;
//
//	@Override
//	public CategoryDTO addNewCategory(CategoryDTO dto) {
//		Category category = mapper.map(dto, Category.class);
//		return mapper.map(catDao.save(category), CategoryDTO.class);
//	}
//
//}
