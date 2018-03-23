package am.lad.onlineshop.model.product;

/**
 * Created by David on 3/22/2018.
 */
public class ProductCategory {

    private Long id;
    private Long productTypeId;
    private String productCategoryName;

    public ProductCategory(Long id, String productCategoryName) {
        this.id = id;
        this.productCategoryName = productCategoryName;
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

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }
}
