package web.service;

import web.model.Car;

import java.util.List;

public interface ServiceInt {
    List<Car> getCars(List<Car> cars, Integer count);
}
