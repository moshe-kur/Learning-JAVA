import genericsPack.ValueHolder;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ValueHolder<Integer> intValue = new ValueHolder<>();
        ValueHolder<String> stringValue = new ValueHolder<>();
        ValueHolder<Boolean> booleanValue = new ValueHolder<>();
        ValueHolder<Float> floatValue = new ValueHolder<>();

        intValue.setValue(10);
        stringValue.setValue("Hii there!");
        booleanValue.setValue(true);
        floatValue.setValue(199.55F);

        System.out.println("Int value: " + intValue.getValue());
        System.out.println("String value: " + stringValue.getValue());
        System.out.println("Boolean value: " + booleanValue.getValue());
        System.out.println("float value: " + floatValue.getValue());

        intValue.setValue(123);
        stringValue.setValue("Good bye");
        booleanValue.setValue(false);
        floatValue.setValue(33.33F);

        System.out.println("Int value: " + intValue.getValue());
        System.out.println("String value: " + stringValue.getValue());
        System.out.println("Boolean value: " + booleanValue.getValue());
        System.out.println("float value: " + floatValue.getValue());

    }
}