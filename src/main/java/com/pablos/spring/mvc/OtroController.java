package com.pablos.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OtroController {

    @RequestMapping("/showDetails")
    public String showDetails(@Valid @ModelAttribute("employee") Employee emp
            , BindingResult bindingResult) { // BindingResult указывать СРАЗУ после валидируемого аргумента

        if (bindingResult.hasErrors())
            return "show_ask";
        else {
            String name = emp.getName();
            emp.setName("Mr " + name); // модифицировать
            return "show_details";
        }
    }
}

