package com.pablos.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtroController {

    @RequestMapping("/showDetails")
    public String showDetails() {
        return "show_details";
    }
}

