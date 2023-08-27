package com.pablos.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OtroController {

    @RequestMapping("/showDetails")
    public String showDetails(@RequestParam("empName") String name, Model model) { // можно читать реквесты и сувать в модель на хранение
        name = "Mr " + name; // модифицировать
        model.addAttribute("employeeName", name); // сунуть в модель, в поле employeeName

        return "show_details";
    }
}

