package com.saud.product.controller;

import com.saud.product.Service.ProductService;
import com.saud.product.entity.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SAUD on 8/29/2020.
 */
@RestController
@RequestMapping(value = "/")

public class ProductController {

  private final ProductService productService;

  @Autowired
  private Environment environment;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("")
  public ResponseEntity welcome() {
    return ResponseEntity.ok("Welcome to Product Service!");
  }

  @GetMapping("/product")
  public List<Product> getAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping("/product/{id}")
  public Product getProductById(@PathVariable(name = "id") Long id) {
    return productService.getProductById(id);
  }
}
