package web.services;

import web.models.Car;

import java.util.List;

public interface CarsServiceInt {
    List<Car> tableService(int count);
}
