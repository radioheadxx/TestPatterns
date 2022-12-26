package abstract_factory_method;

import factory_method_2.Car;

public class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("Audi drives");
    }
}
