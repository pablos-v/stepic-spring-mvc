package com.pablos.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // это контроллер !!!
public class MyController {

    @RequestMapping("/1") // метод сработает только на странице /1
    public String showView1() {
        return "view1"; // тут указать название въюшки
    }

    @RequestMapping("/")
    public String showMain() {
        return "main_page";
    }

    @RequestMapping("/askDetails")
    public String showAsk() {
        return "show_ask";
    }
}
