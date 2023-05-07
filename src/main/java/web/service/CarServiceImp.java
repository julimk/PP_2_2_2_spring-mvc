package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{
    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT,"Model1","Series1"));
        cars.add(new Car(++CAR_COUNT,"Model2","Series2"));
        cars.add(new Car(++CAR_COUNT,"Model3","Series3"));
        cars.add(new Car(++CAR_COUNT,"Model4","Series4"));
        cars.add(new Car(++CAR_COUNT,"Model5","Series5"));
    }

    @Override
    public List<Car> getCars(Integer numCars) {
        if (numCars == null) {
            return cars;
        }
        return cars.stream().limit(numCars).collect(Collectors.toList());
    }

}
