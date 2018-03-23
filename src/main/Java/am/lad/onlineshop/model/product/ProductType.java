package am.lad.onlineshop.model.product;

/**
 * Created by David on 3/22/2018.
 */
public class ProductType {

    private Long id;
    private String productTypeName;

    public ProductType(Long id, String productTypeName) {
        this.id = id;
        this.productTypeName = productTypeName;
    }

    public ProductType(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }
}
