package am.lad.onlineshop.model.product;


import java.io.File;

/**
 * Created by David on 3/22/2018.
 */
public final class ProductImage {

    private Long id;
    private File productImage;
    private String filePath;
    private String absoluteFilePath;

    public ProductImage(File productImage, String filePath) {
        productImage = new File(filePath);
        this.absoluteFilePath = productImage.getAbsolutePath();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public File getProductImage() {
        return productImage;
    }

    public void setProductImage(File productImage) {
        this.productImage = productImage;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAbsoluteFilePath() {
        return absoluteFilePath;
    }

    public void setAbsoluteFilePath(String absoluteFilePath) {
        this.absoluteFilePath = absoluteFilePath;
    }
}
