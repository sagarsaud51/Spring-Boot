package com.saud.product.Service;

import com.saud.product.Repository.ProductRepository;
import com.saud.product.entity.Product;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author SAUD on 8/29/2020.
 */

@Service
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  public Product getProductById(final Long id) {
    return productRepository.getOne(id);
  }
}
