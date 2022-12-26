package abstract_factory_method;

import factory_method_2.Car;
import factory_method_2.CarFactory;

public class AbstractFactory implements TankFactory, CarFactory {
    @Override
    public Tank creatTank(String typeOfTank) {
        switch (typeOfTank) {
            case "T51":
                return new T51();
            case "T52":
                return new T52();
            default: return null;
        }
    }

    @Override
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Audi":
                return new Audi();
            case "Toyota":
                return new Toyota();
            default: return null;
        }
    }
}
