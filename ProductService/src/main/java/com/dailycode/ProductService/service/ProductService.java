package com.dailycode.ProductService.service;

import com.dailycode.ProductService.model.ProductRequest;
import com.dailycode.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);
}
