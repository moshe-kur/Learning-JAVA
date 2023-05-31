package TransportationPack;

public class Vehicle extends Transportation {
    public Vehicle(int speed, int engineCapacity,String FuelType)
    {

        super(speed,engineCapacity);
        this.fuelType=FuelType;
    }
    private String fuelType;

    public void printDetails(){
        System.out.println("Speed: " + this.speed);
        System.out.println("Engine Capacity: " + this.engineCapacity);
        System.out.println("FuelType: " + this.fuelType);
    }
}
