/**
 * the origin material
 *
 * @author pudinr
 * @version 1.0
 * @className PACKAGE_NAME.material
 * @copyright Copyright 2022 pudinr, Inc All rights reserved.
 * @date 2022-12-03 11:58
 */
public class material {
    private String name;
    private String attribute;
    private String price;
    private String productAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductAddress() {
        return productAddress;
    }

    public void setProductAddress(String productAddress) {
        this.productAddress = productAddress;
    }
}
