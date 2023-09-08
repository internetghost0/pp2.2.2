package com.springmvc.controllers;

import com.springmvc.models.Car;
import com.springmvc.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "5") Integer count, Model model) {
        List<Car> cars = carService.getNCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
