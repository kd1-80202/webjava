


























































//package com.app.service;
//
//
//
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.app.custom_exception.ResourceNotFoundException;
//import com.app.dao.CategoryDao;
//import com.app.dao.ProductDao;
//import com.app.dto.AddProductDTO;
//
//import com.app.dto.ProductRespDTO;
//import com.app.dto.ShowProductDTO;
//import com.app.dto.UpdateProductDTO;
//import com.app.entities.Category;
//import com.app.entities.Product;
//@Service
//@Transactional
//public class ProductServiceImpl implements ProductService {
//
//	
//	@Autowired
//	private ProductDao proDao;
//	
//	
//	@Autowired
//	private ModelMapper mapper;
//	
//	@Autowired
//	private CategoryDao categorydao;
//
//	
//	
//
//	@Override
//	public ProductRespDTO addNewProduct(AddProductDTO dto) {
//		Category category =categorydao.findById(dto.getCategoryId())
//				.orElseThrow(()-> new ResourceNotFoundException("Invalid category ID !!!"));
//		
//		
//		Product product =mapper.map(dto, Product.class);
//		
//		product.setProductCategory(category);
//		
//		return mapper.map(proDao.save(product),
//				ProductRespDTO.class);
//		
//	}
//
//
//
//	@Override
//	public List<ShowProductDTO> getAllProductsByCategory(Long categoryId) {
//		Category cat=categorydao.findById(categoryId)
//				.orElseThrow(()->new ResourceNotFoundException("Invalid category Id"));
//		
//		
//		return proDao.findByProductCategory(cat).stream().map(product->mapper.map(product,ShowProductDTO.class)).collect(Collectors.toList());
//	}
//
//
//
//	@Override
//	public String deleteProductById(Long productId) {
//		  if(proDao.existsById(productId)) {
//			  proDao.deleteById(productId);
//			  return "deleted...";
//		  }
//		return "Not deleted....";
//	}
//
//
//
//	@Override
//	public UpdateProductDTO updateProductById(UpdateProductDTO pdto,Long productId) {
//		
//		Product pdt =proDao.findById(productId).orElseThrow();
//		pdt.setPrice(pdto.getPrice());
//		return mapper.map(pdt, UpdateProductDTO.class);
//	}
////	
////	@Override
////    public List<Course> getCoursesByName(String name) {
////        // Implement and return the courses matching the given name
////        return Optional.ofNullable(courseRepository.findByName(name))
////                .orElse(Collections.emptyList());
////    }


	
	

