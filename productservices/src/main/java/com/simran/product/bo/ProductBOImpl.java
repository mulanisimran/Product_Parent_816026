package com.simran.product.bo;

import com.simran.product.dao.ProductDAO;
import com.simran.product.dao.ProductDAOImpl;
import com.simran.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
