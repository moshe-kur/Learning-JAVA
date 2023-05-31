package ShopPack;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> productList;
    public Shop() {
        this.productList = new ArrayList<Product>() {
        };
    }
    public void addProduct(Product product) {
        this.productList.add(product);
    }
    public List<Product> getProductList(){
        return this.productList;
    }

}
