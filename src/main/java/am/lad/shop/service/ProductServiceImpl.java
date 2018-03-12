package am.lad.shop.service;

import am.lad.shop.model.Product;

import java.util.HashMap;


/**
 * Created by David on 3/13/2018.
 */
public class ProductServiceImpl implements ProductService {

    private Product product;

    private HashMap<String, Product> productsList;

    public ProductServiceImpl() {

    }

    public void save(Product product) {
        productsList.put(product.getVendorCode(), product);
    }

    public void delete(Product product) {
        productsList.remove(product);
    }

    public void change(Product product, String productName, Double price) {

        if (productsList.containsKey(product.getVendorCode())) {

            if (productName != null) {
                product.setProductName(productName);
            }

            if (price != null) {
                product.setPrice(price);
            }
        }
    }

    public HashMap<String, Product> findAll() {
        return productsList;
    }

    public Product findByVendorCode(String vendorCode) {

        for (String str: productsList.keySet()) {
            if (str.equals(vendorCode))
                return productsList.get(str);
        }

        return null;
    }
}
