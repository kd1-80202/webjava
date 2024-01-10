













































//package com.app.controller;
//
//
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.app.dto.AddProductDTO;
//
//import com.app.dto.ProductRespDTO;
//import com.app.dto.ShowProductDTO;
//import com.app.dto.UpdateProductDTO;
//import com.app.service.ProductService;
//
//@RestController
//
//@RequestMapping("/products")
//@CrossOrigin(origins="http://localhost:8080")
//public class ProductController {
//
//	@Autowired
//	private ProductService prodService;
//
//	public ProductController() {
//		System.out.println("in ctor of" +getClass());
//	}
//	
//
//	// Add REST API end point to add the product in the existing category
//		//URL : http://host:port/products , method=POST
//		//resp : product resp dto
//
//@PostMapping
//public ProductRespDTO addNewProduct(@RequestBody @Valid AddProductDTO dto) {
//	System.out.println("in add new category");
//	return prodService.addNewProduct(dto);
//}
//
//@GetMapping("/category/{categoryId}")
//public List<ShowProductDTO> getAllProductsDetailsByCategory(@PathVariable Long categoryId){
//	return prodService.getAllProductsByCategory(categoryId);
//	
//}
//
//@DeleteMapping("/{productId}")
//
//	public String deteteProductById(@PathVariable Long productId) {
//	return prodService.deleteProductById(productId);
//}
//@PutMapping("/{productId}")
//public UpdateProductDTO updateProductDetails(@RequestBody UpdateProductDTO pdto,@PathVariable Long productId ) {
//	return prodService.updateProductById(pdto,productId);
//}
////@GetMapping
////public List<Course> getCoursesByName(@RequestParam String name) {
////    return courseService.getCoursesByName(name);
////}
//}
