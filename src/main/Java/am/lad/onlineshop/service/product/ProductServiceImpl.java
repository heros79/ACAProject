package am.lad.onlineshop.service.product;

import am.lad.onlineshop.DBConn;
import am.lad.onlineshop.model.product.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.NULL;

/**
 * Created by David on 3/15/2018.
 */
public class ProductServiceImpl implements ProductService {

    private PreparedStatement statement = null;
    private List <Product> productsList;

    public void save(Product product) throws SQLException {

        statement = DBConn.conn.prepareStatement("INSERT INTO " +
        "products VALUE (?, ?, ?, ?, ?)");
        statement.setNull(1, NULL);
        statement.setString(2, product.getVendorCode());
        statement.setString(3, product.getProductName());
        statement.setDouble(4, product.getPrice());
        statement.setString(5, product.getDescription());

        statement.executeUpdate();

        DBConn.conn.close();
    }

    public void change(Product product, String productName, Double price) throws SQLException {

        if (productName != null)
            statement = DBConn.conn.prepareStatement("UPDATE products SET productname =" +
                    productName + "WHERE vendorcode =" + product.getVendorCode());
        if (price != null)
            statement = DBConn.conn.prepareStatement("UPDATE products SET price =" +
                    price + "WHERE vendorcode =" + product.getVendorCode());

        statement.executeUpdate();

        DBConn.conn.close();
    }

    public List<Product> findAll() throws SQLException {

        productsList = new ArrayList<Product>();
        statement = DBConn.conn.prepareStatement("SELECT * FROM products");

        ResultSet result = statement.executeQuery();

        while (result.next())
            productsList.add(new Product(
                    result.getInt(1),
                    result.getString(2),
                    result.getString(3),
                    result.getDouble(4),
                    result.getString(5)));

        DBConn.conn.close();


        return productsList;
    }

    public Product findByVendoreCode(String vendoreCode) throws SQLException {

        Product product = null;
        statement = DBConn.conn.prepareStatement("SELECT * FROM products " +
                "WHERE vendorecode = ?");

        statement.setString(1, vendoreCode);

        ResultSet result = statement.executeQuery();

        while (result.next())
            product = new Product(
                    result.getInt(1),
                    result.getString(2),
                    result.getString(3),
                    result.getDouble(4),
                    result.getString(5));

        DBConn.conn.close();

        return product;
    }

    public List<Product> getProductsList() {
        return productsList;
    }
}
