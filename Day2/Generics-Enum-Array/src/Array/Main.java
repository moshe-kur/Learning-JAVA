
package Array;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        
        Product[] products =   {
                new Electronics("computer", 565, "i5 irisx", "HP", 2500),
                new Electronics("phone", 888, "Samsung S21", "Samsung", 4000),
                new Clothing("T-shirt", 30, "Blue t-shirt", "M", "synthetic"),
                new Clothing("pans", 75, "Green pans", "M", "Cotton"),
        };


        for (Product product : products) {
            product.printProduct();
        }
    }
}
