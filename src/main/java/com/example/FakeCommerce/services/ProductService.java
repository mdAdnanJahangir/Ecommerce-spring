package com.example.FakeCommerce.services;

import com.example.FakeCommerce.schema.Product;


import dtos.CreateProductRequestDto;
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



    public Product createProduct(CreateProductRequestDto requestDto){

        Product newProduct = Product.builder()
                .title(requestDto.getTitle())
                .description(requestDto.getDescription())
                .image(requestDto.getImage())
                .price(requestDto.getPrice())
                .category(requestDto.getCategory())
                .rating(requestDto.getRating())
                .build();
        return productRepository.save(newProduct);
    }







}
