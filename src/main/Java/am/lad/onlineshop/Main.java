package am.lad.onlineshop;

import am.lad.onlineshop.model.product.Product;
import am.lad.onlineshop.service.product.ProductServiceImpl;

import java.sql.SQLException;


/**
 * Created by David on 3/15/2018.
 */
public class Main {

    public static void main(String[] args) {

        DBConn.getInstance();
        ProductServiceImpl p = new ProductServiceImpl();

        try {
            Product product = p.findByVendoreCode("1-1");
            System.out.println(product.getProductName());
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
