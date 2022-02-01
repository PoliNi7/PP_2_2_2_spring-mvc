package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.Service;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/car")
    public String printWelcome(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        Service service = new Service();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("a", 2,4000));
        cars.add(new Car("b", 5,5500));
        cars.add(new Car("c", 3,3000));
        cars.add(new Car("d", 7,3700));
        cars.add(new Car("k", 9,2800));
            model.addAttribute("cars", service.getCars(cars, count));
        return "cars";
    }
}
