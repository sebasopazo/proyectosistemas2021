
package com.jp1.terminal_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PagNoDinamicaController {
    
    @GetMapping("/contacto")
    public String contacto(Model model){
        return "contacto";
    }
    
    @GetMapping("/terminales")
    public String terminal(Model model){
        return "terminales";
    }
    
    @GetMapping("/nosotros")
    public String nosotros(Model model){
        return "nosotros";
    }
    
}
