package com.izvoc.barber.Repository;

import com.izvoc.barber.Entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository  extends JpaRepository<Products,Long> {
}
