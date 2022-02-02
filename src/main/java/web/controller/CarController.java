package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarCarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/car")
    public String printWelcome(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        CarCarServiceImpl carServiceImpl = new CarCarServiceImpl();
            model.addAttribute("cars", carServiceImpl.getCars(count));
        return "cars";
    }
}
