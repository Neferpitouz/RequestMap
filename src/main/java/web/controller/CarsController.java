package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Testla"));
        cars.add(new Car("Volvo"));
        cars.add(new Car("Ural"));
        cars.add(new Car("Man"));
        cars.add(new Car("Chainacar"));
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count") int count, Model model) {
        if (count < 5) {
            List<Car> result = cars.subList(0, count);
            model.addAttribute("carsTable", result);
        } else {
            model.addAttribute("carsTable", cars);
        }
        return "cars";
    }
}
