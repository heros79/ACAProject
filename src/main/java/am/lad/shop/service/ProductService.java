package am.lad.shop.service;

import am.lad.shop.model.Product;

import java.util.HashMap;

/**
 * Created by David on 3/8/2018.
 */
public interface ProductService {

    void save(Product product);

    void delete(Product product);

    void change (Product product, String productName, Double price);

    HashMap<String, Product> findAll ();

    Product findByVendorCode (String vendorCode);

}
