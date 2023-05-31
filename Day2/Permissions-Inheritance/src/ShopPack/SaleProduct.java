package ShopPack;

public class SaleProduct extends Product{

    private int sale;
    public SaleProduct(String Name, int Price,int Sale)
    {
        super(Name, Price);
        this.sale=Sale;

    }
    //for accuracy use float
    public int getDiscountedPrice()
    {

        return getPrice()-(this.sale/100*getPrice());
    }
}
