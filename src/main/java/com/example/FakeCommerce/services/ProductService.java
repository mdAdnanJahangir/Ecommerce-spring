package com.example.FakeCommerce.services;

import com.example.FakeCommerce.schema.Product;
import org.springframework.stereotype.Service;

import com.example.FakeCommerce.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;


import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductService{

    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();

    }




}
