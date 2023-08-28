package com.pablos.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OtroController {

    @RequestMapping("/showDetails")
    public String showDetails(@ModelAttribute("employee") Employee emp) { // олучаем доступ к атрибуту модели типа Employee
        String name = emp.getName();
        emp.setName("Mr " + name); // модифицировать

        return "show_details";
    }
}

