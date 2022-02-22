package com.simran.product.bo;

import com.simran.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
