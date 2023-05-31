package TransportationPack;

public class Car extends Vehicle{
    public Car(int speed, int engineCapacity, String FuelType) {
        super(speed, engineCapacity, FuelType);
    }
    protected char airConditionerPower = '0';
    public void increaseAirConditioner(){
        this.airConditionerPower++;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Air Conditioner Power: " + this.airConditionerPower);
    }
}
