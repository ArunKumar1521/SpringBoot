package com.arun.webApp.repository;

import com.arun.webApp.Model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface productRepo extends JpaRepository<Product, Integer> {

}
