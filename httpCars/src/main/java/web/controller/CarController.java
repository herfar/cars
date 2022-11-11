package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cars")
public class CarController {
    
    private final serviceForCar serviceForCar;
    
    @Autowired
    public CarController(serviceForCar serviceForCar) {
        this.serviceForCar = serviceForCar;
    }

    @GetMapping()
    public String countCars(@RequestParam(name = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", serviceForCar.countCars(count));
        return "cars";
    }
}
