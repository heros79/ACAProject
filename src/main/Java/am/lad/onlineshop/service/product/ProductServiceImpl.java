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

        Connection conn = new DBConn().getConnection();

        statement = conn.prepareStatement("INSERT INTO " +
        "products VALUE (?, ?, ?, ?, ?)");
        statement.setNull(1, NULL);
        statement.setString(2, product.getVendorCode());
        statement.setString(3, product.getProductName());
        statement.setDouble(4, product.getPrice());
        statement.setString(5, product.getDescription());

        statement.executeUpdate();

        conn.close();
    }

    public void change(Product product, String productName, Double price) throws SQLException {

        Connection conn = new DBConn().getConnection();

        if (productName != null)
            statement = conn.prepareStatement("UPDATE products SET productname =" +
                    productName + "WHERE vendorcode =" + product.getVendorCode());
        if (price != null)
            statement = conn.prepareStatement("UPDATE products SET price =" +
                    price + "WHERE vendorcode =" + product.getVendorCode());

        statement.executeUpdate();

        conn.close();
    }

    public List<Product> findAll() throws SQLException {

        Connection conn = new DBConn().getConnection();

        productsList = new ArrayList<Product>();
        statement = conn.prepareStatement("SELECT * FROM products");

        ResultSet result = statement.executeQuery();

        while (result.next())
            productsList.add(new Product(
                    result.getLong(1),
                    result.getString(2),
                    result.getString(3),
                    result.getDouble(4),
                    result.getString(5)));

        conn.close();


        return productsList;
    }

    public Product findByVendoreCode(String vendoreCode) throws SQLException {

        Connection conn = new DBConn().getConnection();

        Product product = null;
        statement = conn.prepareStatement("SELECT * FROM products " +
                "WHERE vendorecode = ?");

        statement.setString(1, vendoreCode);

        ResultSet result = statement.executeQuery();

        while (result.next())
            product = new Product(
                    result.getLong(1),
                    result.getString(2),
                    result.getString(3),
                    result.getDouble(4),
                    result.getString(5));

        conn.close();

        return product;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    private int getProductId(String vendoreCode) throws SQLException {

        Connection conn = new DBConn().getConnection();

        statement = conn.prepareStatement("SELECT id FROM products WHERE vendorecode = ?");
        statement.setString(1, vendoreCode);

        ResultSet result = statement.executeQuery();

        result.next();

        return result.getInt("id");
    }
}
