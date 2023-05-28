package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarsService;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count") int count, Model model) {
        CarsService carsService = new CarsService();
        model.addAttribute("carsTable", carsService.tableService(count));
        return "cars";
    }
}
