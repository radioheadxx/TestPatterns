package decorator;

public class DecoratorPrinter implements PrintInterface{
    private Print print;

    public DecoratorPrinter(Print print) {
        this.print = print;
    }

    @Override
    public void print(String s) {
        System.out.print("\"");
        print.print(s);
        System.out.print("\"");
    }
}
