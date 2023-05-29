package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarsService;


@Controller
public class CarsController {

    private final CarsService carsServiceInt;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsServiceInt = carsService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count") int count, Model model) {
        model.addAttribute("carsTable", carsServiceInt.tableService(count));
        return "cars";
    }
}
