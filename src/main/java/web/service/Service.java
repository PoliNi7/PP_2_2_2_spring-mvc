package web.service;

import web.dao.Dao;
import web.dao.DaoInt;
import web.model.Car;

import java.util.List;

public class Service implements ServiceInt{

    DaoInt dao = new Dao();

    @Override
    public List<Car> getCars(List<Car> cars, Integer count) {
        return dao.getCars(cars, count);
    }
}
