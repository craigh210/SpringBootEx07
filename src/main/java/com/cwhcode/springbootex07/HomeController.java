package com.cwhcode.springbootex07;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class HomeController {

    @GetMapping("/newcar")
    public String enterCar(Model model) {
        model.addAttribute("car", new Car());
        return "newcar";
    }

    @PostMapping("/newcar")
    public String processEntry(@Valid Car car, BindingResult result) {
        if (result.hasErrors()) {
            return "newcar";
        }
        return "showcar";
    }
}
