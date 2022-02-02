package web.dao;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarCarDaoImpl implements CarDao {

    List<Car> cars = Arrays.asList(
            new Car("a", 2,4000),
            new Car("b", 5,5500),
            new Car("c", 3,3000),
            new Car("d", 7,3700),
            new Car("k", 9,2800));

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) {
            return cars;
        }
        if (count <= cars.size()) {
            return cars.subList(0, count);
        } else return cars;
    }
}
