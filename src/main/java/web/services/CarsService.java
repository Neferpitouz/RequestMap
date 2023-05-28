package web.services;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsService {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Testla"));
        cars.add(new Car("Volvo"));
        cars.add(new Car("Ural"));
        cars.add(new Car("Man"));
        cars.add(new Car("Chainacar"));
    }

    public List<Car> tableService (int count) {
        if (count < 5 || count > 0) {
            List<Car> result = cars.subList(0, count);
            return result;
        } else {
            return cars;
        }
    }

}
