package am.lad.shop.model;

/**
 * Created by David on 3/8/2018.
 */
public class Product {

    private Long id;
    private String vendorCode;
    private String productName;
    private Integer count;
    private Double price;
    private String description;

    public Product(Long id, String vendorCode, String productName, Integer count, Double price, String description) {
        this.id = id;
        this.vendorCode = vendorCode;
        this.productName = productName;
        this.count = count;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;

        if (this == obj)
            return true;

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Product other = (Product) obj;

        if (!other.vendorCode.equals(((Product) obj).vendorCode))
            return false;

        if (!other.productName.equals(((Product) obj).productName))
            return false;

        if ((int)other.count != ((Product) obj).count)
            return false;

        if ((double)other.price != ((Product) obj).price)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return vendorCode.hashCode() * 31 + 17 + id.intValue() * 33 +15;
    }
}
