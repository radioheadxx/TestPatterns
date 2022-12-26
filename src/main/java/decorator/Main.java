package decorator;

public class Main {
    public static void main(String[] args) {
        PrintInterface print = new DecoratorPrinter(new Print());
        print.print("Hi");
    }
}
