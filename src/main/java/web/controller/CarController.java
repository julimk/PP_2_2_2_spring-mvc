package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarServiceImp;

@Controller
public class CarController {

    private final CarServiceImp carService;

    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(Model model, Integer count) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}




