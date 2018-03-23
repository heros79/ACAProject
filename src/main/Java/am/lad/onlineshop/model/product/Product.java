package am.lad.onlineshop.model.product;


import java.awt.Image;

/**
 * Created by David on 3/15/2018.
 */
public class Product {

    private Long id;
    private Long productTypeId;
    private Long productCategoryId;
    private Long productMarkId;
    private String vendorCode;
    private String productName;
    private Double price;
    private String description;

    public Product(Long productTypeId, Long productCategoryId, Long productMarkId, String vendorCode, String productName,
                   Double price, String description) {
        this.productTypeId = productTypeId;
        this.productCategoryId = productCategoryId;
        this.productMarkId = productMarkId;
        this.vendorCode = vendorCode;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public Product(Long id, Long productTypeId, Long productCategoryId, Long productMarkId, String vendorCode,
                   String productName, Double price, String description) {
        this.id = id;
        this.productTypeId = productTypeId;
        this.productCategoryId = productCategoryId;
        this.productMarkId = productMarkId;
        this.vendorCode = vendorCode;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public Product(Long id, String vendorCode, String productName, Double price, String description) {
        this.id = id;
        this.vendorCode = vendorCode;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getProductMarkId() {
        return productMarkId;
    }

    public void setProductMarkId(Long productMarkId) {
        this.productMarkId = productMarkId;
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
