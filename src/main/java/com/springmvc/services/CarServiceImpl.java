package com.springmvc.services;

import com.springmvc.models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    public CarServiceImpl() {
        cars.add(new Car("Honda", "Civic Type R", "JP"));
        cars.add(new Car("Mitsubishi", "Lancer Evolution", "JP"));
        cars.add(new Car("Porsche", "911", "DE"));
        cars.add(new Car("Audi", "RS7", "DE"));
        cars.add(new Car("Lamborghini", "Huracan", "IT"));
    }
    @Override
    public List<Car> getNCars(Integer n) {
        if (n > 0) {
            return cars.stream().limit(n).toList();
        } else {
            return cars;
        }
    }
}
