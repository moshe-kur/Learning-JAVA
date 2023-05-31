package ShopPack;

public class Product {
    private String name;
    private int price;
    protected int aaa;
    public Product(String Name,int Price)
    {
        this.name=Name;
        this.price=Price;
    }
    public int getPrice() {
        return price;
    }
}
