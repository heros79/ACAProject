package am.lad.onlineshop.model.product;

/**
 * Created by David on 3/22/2018.
 */
public class ProductMark {

    private Long id;
    private Long productTypeId;
    private Long productCategoryId;
    private String productMarkName;

    public ProductMark(Long id, String productMarkName) {
        this.id = id;
        this.productMarkName = productMarkName;
    }

    public ProductMark(Long productTypeId, Long productCategoryId, String productMarkName) {
        this.productTypeId = productTypeId;
        this.productCategoryId = productCategoryId;
        this.productMarkName = productMarkName;
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

    public String getProductMarkName() {
        return productMarkName;
    }

    public void setProductMarkName(String productMarkName) {
        this.productMarkName = productMarkName;
    }
}
