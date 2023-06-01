package Array;

public class Clothing extends Product{
    private String size;
    private String material;

    public Clothing(String name, int price, String description, String size, String material) {
        super(name, price, description);
        this.size = size;
        this.material = material;
    }

    public void printProduct() {
        System.out.println("Clothing:");
        super.printProduct();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println();
    }
}
