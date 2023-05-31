import Bank.BankAccount;
import ElectricPack.*;
import Office.File;
import ShopPack.Product;
import ShopPack.Shop;
import TransportationPack.Car;
import TransportationPack.Vehicle;
import writingToolsPack.Pen;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen("Blue");
        pen.delete();
        System.out.println(pen.getColor());


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

/*
//car inheritance
  Vehicle ven = new Vehicle(120,80,"95");
        Car car = new Car(140,90,"98");

        car.printDetails();
        ven.printDetails();
        car.increaseAirConditioner();
        car.printDetails();
 */

/*
//
 Computer computer = new Computer();
        computer.printMessage();
        computer.powerOn();
        computer.printMessage();
 */