import Bank.BankAccount;
import Office.File;
import ShopPack.Product;
import ShopPack.Shop;
import TransportationPack.Car;
import TransportationPack.Vehicle;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle ven = new Vehicle(120,80,"95");
        Car car = new Car(140,90,"98");

        car.printDetails();
        ven.printDetails();
        car.increaseAirConditioner();
        car.printDetails();
    }
}

/*
//shop check
   Shop MyShop = new Shop();
        Product product = new Product("abc",10);
        MyShop.addProduct(product);
        List<Product> list = MyShop.getProductList();
        System.out.println(list.get(0).getPrice());

 */