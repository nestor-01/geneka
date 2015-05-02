package com.geneka.product.bs;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.geneka.modelnosql.Product;


@Repository
public class ProductServiceImpl implements ProductService {

//	@Autowired
//	private MongoTemplate mongoTemplate;	
//	
//	public static final String COLLECTION_NAME = "product";
//	
//	public void addProduct(Product product) {
//        if (!mongoTemplate.collectionExists(Product.class)) {
//            mongoTemplate.createCollection(Product.class);
//        }       
//        product.setId(UUID.randomUUID().toString());
//        mongoTemplate.insert(product, COLLECTION_NAME);
//    }
//     
//    public List<Product> listProducts() {
//        return mongoTemplate.findAll(Product.class, COLLECTION_NAME);
//    }
//     
//    public void deleteProduct(Product product) {
//        mongoTemplate.remove(product, COLLECTION_NAME);
//    }
//     
//    public void updatePproduct(Product product) {
//        mongoTemplate.insert(product, COLLECTION_NAME);
//    }
	
}
