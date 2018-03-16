package am.lad.onlineshop.service.product;

import am.lad.onlineshop.model.product.Product;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by David on 3/15/2018.
 */
public interface ProductService {

    void save (Product product) throws SQLException;
    void change (Product product, String productName, Double price) throws SQLException;
    List <Product> findAll() throws SQLException;
    Product findByVendoreCode(String vendoreCode) throws SQLException;
}
