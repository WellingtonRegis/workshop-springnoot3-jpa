package com.ricardoregis.demonstracao.services;

import com.ricardoregis.demonstracao.entities.Category;
import com.ricardoregis.demonstracao.entities.Product;
import com.ricardoregis.demonstracao.repositories.CategoryRepository;
import com.ricardoregis.demonstracao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
