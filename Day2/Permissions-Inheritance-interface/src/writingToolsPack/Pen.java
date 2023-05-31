package writingToolsPack;

public class Pen extends wriringTools implements IDelete{
    public Pen(String color) {
        super(color);
    }

    @Override
    public void delete() {
        System.out.println("Pen-optimized erasure");

    }

}
