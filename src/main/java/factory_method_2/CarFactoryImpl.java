package factory_method_2;

public class CarFactoryImpl implements CarFactory {
    @Override
    public Car createCar(String s) {
        Car car = null;
        switch (s) {
            case "Toyota":
                car =  new Toyota();
                break;
            case "Porsche":
                car = new Porsche();
                break;
        }
        return car;
    }
}
