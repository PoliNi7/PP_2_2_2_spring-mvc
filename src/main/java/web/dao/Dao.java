package web.dao;

import web.model.Car;

import java.util.List;

public class Dao implements DaoInt {

    @Override
    public List<Car> getCars(List<Car> cars, Integer count) {
        if (count == null) {
            return cars;
        }
        if (count <= cars.size()) {
            return cars.subList(0, count);
        } else return cars;
    }
}
