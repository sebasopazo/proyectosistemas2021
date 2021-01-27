
package com.jp1.terminal_spring.controllers;

import com.jp1.terminal_spring.modelo.Asiento;
import com.jp1.terminal_spring.modelo.Bus;
import com.jp1.terminal_spring.services.AsientoService;
import com.jp1.terminal_spring.services.BusService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BusController {
    
//    @Autowired
//    private BusService busService;
//    
//    @Autowired
//    private AsientoService asientoService;
//    
//    @GetMapping("/bus/{id}") 
//    public String muestraBus(@PathVariable("id") int idBus,Model model) {
//
//        Bus bus=busService.buscarPorId(idBus);
//        
//        model.addAttribute("buses", bus);
//        model.addAttribute("titulo", "Buses");
//        
//
//        return "bus";
//
//    }
    
}
