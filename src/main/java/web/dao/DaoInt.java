package web.dao;

import web.model.Car;

import java.util.List;

public interface DaoInt {
    List<Car> getCars(List<Car> cars, Integer count);
}
