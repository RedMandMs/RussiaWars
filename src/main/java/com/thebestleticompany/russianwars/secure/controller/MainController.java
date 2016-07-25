package com.thebestleticompany.russianwars.secure.controller;

/**
 * Created by ManUnited on 22.07.2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model){
        return "index";
    }
}
