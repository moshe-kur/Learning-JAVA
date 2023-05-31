package ElectricPack;



public class Computer implements IusesElectricity {

    private boolean isOn = false;
    @Override
    public void powerOn() {
        this.isOn=true;
    }

    public void printMessage() {
        if (this.isOn) {
            System.out.println("Computer is: On");
        }
        else {
            System.out.println("Computer is: Off");

        }
    }
}
