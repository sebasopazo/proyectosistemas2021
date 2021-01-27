
package com.jp1.terminal_spring.controllers;

import com.jp1.terminal_spring.modelo.Ciudad;
import com.jp1.terminal_spring.modelo.Viaje;
import com.jp1.terminal_spring.services.CiudadService;
import com.jp1.terminal_spring.services.ViajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    
    @Autowired
    private ViajeService viajeService;
    
    @Autowired
    private CiudadService ciudadService;
    
    @GetMapping({"/index","/home","/"})
    public String index(Model model){
        
        
        Viaje viaje=new Viaje();
        
        List<Viaje> listaViajes=viajeService.listarTodos();
        List<Ciudad> listaCiudades=ciudadService.listarTodos();
        model.addAttribute("ciudades", listaCiudades);
        model.addAttribute("listaViajes", listaViajes);
        model.addAttribute("nuevoViaje", viaje);
        model.addAttribute("titulo", "Agregar Viaje");
        
        return "index";
    }
    
    
    
    
    
    
}
