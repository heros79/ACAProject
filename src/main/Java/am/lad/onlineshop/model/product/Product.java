package am.lad.onlineshop.model.product;

/**
 * Created by David on 3/15/2018.
 */
public class Product {

    private Integer id;
    private String vendorCode;
    private String productName;
    private Double price;
    private String description;

    public Product(Integer id, String vendorCode, String productName, Double price, String description) {
        this.id = id;
        this.vendorCode = vendorCode;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
