package Array;
public class Electronics extends Product {

    Electronics(String name, int price, String description,String producer,int batteryCapacity){
        super( name,  price,  description);
        this.producer = producer;
        this.batteryCapacity = batteryCapacity;
    }
    private String producer;
    private int batteryCapacity;

    @Override
    public void printProduct() {
        System.out.println("Electronics:");
        super.printProduct();
        System.out.println("producer: " + this.producer);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println();

    }
}
