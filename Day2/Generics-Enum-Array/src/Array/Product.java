package Array;

public abstract class Product {
    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    private String name;
    private int price;
    private String description;
    public void printProduct(){
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Description: " + description);
    }


}
