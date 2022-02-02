package web.service;

import web.dao.CarCarDaoImpl;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarCarServiceImpl implements CarService {

    CarDao dao = new CarCarDaoImpl();

    @Override
    public List<Car> getCars(Integer count) {
        return dao.getCars(count);
    }
}
