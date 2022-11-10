package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ImpServiceForCar;

@Controller
@RequestMapping("/cars")
public class CarController {
    private ImpServiceForCar impServiceForCar;

    @Autowired
    public CarController(ImpServiceForCar impServiceForCar) {
        this.impServiceForCar = impServiceForCar;
    }
    @GetMapping()
    public String countCars(@RequestParam(name = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", impServiceForCar.countCars(count));
        return "cars";
    }
}