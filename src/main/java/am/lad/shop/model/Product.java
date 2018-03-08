package am.lad.shop.model;

/**
 * Created by David on 3/8/2018.
 */
public class Product {

    private Long id;
    private String articul;
    private String productName;
    private Integer count;

    public Product(Long id, String articul, String productName, Integer count) {
        this.id = id;
        this.articul = articul;
        this.productName = productName;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
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
}
