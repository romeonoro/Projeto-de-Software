package com.example.exemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WebController {
    @GetMapping("/form")
    public String paginaFormulario(){
        return "form";
    }
}
