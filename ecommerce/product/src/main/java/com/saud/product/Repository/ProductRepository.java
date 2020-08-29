package com.saud.product.Repository;

import com.saud.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SAUD on 8/29/2020.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
