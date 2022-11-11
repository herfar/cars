package web.service;
import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class ImpServiceForCar implements ServiceForCar {

    private List<Car> cars;
        {
        cars = new ArrayList<>();

        cars.add(new Car("volvo", 5, 12));
        cars.add(new Car("porshe", 3, 10));
        cars.add(new Car("bmw", 4, 8));
        cars.add(new Car("toyota", 8, 14));
        cars.add(new Car("kia", 2, 6));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> countCars(int count) {
        List<Car> carsFromCountCars = new ArrayList<>();
        if (count >= cars.size()) {
            return cars;
        } else {
            for (int y = 0; y <= count-1; y++) {
                carsFromCountCars.add(cars.get(y));
            }
        }
        return carsFromCountCars;
    }
}
