package com.springmvc.services;

import com.springmvc.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getNCars(Integer n);
}
