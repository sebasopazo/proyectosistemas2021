/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp1.terminal_spring.controllers;

import com.jp1.terminal_spring.dao.ViajeDao;
import com.jp1.terminal_spring.modelo.Asiento;
import com.jp1.terminal_spring.modelo.Bus;
import com.jp1.terminal_spring.modelo.Viaje;
import com.jp1.terminal_spring.modelo.Ciudad;
import com.jp1.terminal_spring.services.AsientoService;
import com.jp1.terminal_spring.services.BusService;
import com.jp1.terminal_spring.services.CiudadService;
import com.jp1.terminal_spring.services.ViajeService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ViajeController {

    @Autowired
    private ViajeService viajeService;

    @Autowired
    private CiudadService ciudadService;

    @Autowired
    private BusService busService;

    @Autowired
    private AsientoService asientoService;

//    @RequestMapping("/url")
//    public String page(Model model) {
//        model.addAttribute("attribute", "value");
//        return "view.name";
//    }
    @GetMapping("/viajes")
    public String muestraViajes(Model model) {

        List<Viaje> listaViajes = viajeService.listarTodos();
        model.addAttribute("titulo", "Lista de viajes");
        model.addAttribute("listaViajes", listaViajes);

        return "viaje";

    }

    @GetMapping("/agregarViaje") //nombre en el url
    public String crear(Model model) {

        Viaje viaje = new Viaje();

        List<Viaje> listaViajes = viajeService.listarTodos();
        List<Ciudad> listaCiudades = ciudadService.listarTodos();
        model.addAttribute("ciudades", listaCiudades);
        model.addAttribute("listaViajes", listaViajes);
        model.addAttribute("nuevoViaje", viaje);
        model.addAttribute("titulo", "Agregar Viaje");

        return "agregarViaje";

    }

    @PostMapping({"/index"})
    public String guardarr(@ModelAttribute Viaje viaje) {

        int idViaje = 0;

        for (int i = 0; i < viajeService.listarTodos().size(); i++) {
            if (viajeService.listarTodos().get(i).getOrigen().equalsIgnoreCase(viaje.getOrigen()) && viajeService.listarTodos().get(i).getDestino().equalsIgnoreCase(viaje.getDestino()) && viajeService.listarTodos().get(i).getFecha().equalsIgnoreCase(viaje.getFecha()) && viajeService.listarTodos().get(i).getHoraSalida().equalsIgnoreCase(viaje.getHoraSalida())) {

                idViaje = viajeService.listarTodos().get(i).getId();
                break;
            }
        }

        for (int j = 0; j < busService.listarTodos().size(); j++) {
            if (idViaje == busService.listarTodos().get(j).getIdViaje().getId()) {
                idViaje = busService.listarTodos().get(j).getId();
                break;
            } 
        }

        if (idViaje == 0) {
            
            viajeService.Guardar(viaje);

            Bus b = new Bus();
            b.setId(viajeService.listarTodos().get(viajeService.listarTodos().size() - 1).getId());
            b.setIdViaje(viajeService.listarTodos().get(viajeService.listarTodos().size() - 1));

            busService.Guardar(b);

            for (int i = 1; i <= 36; i++) {

                Asiento s = new Asiento();
                s.setEstado(0);
                s.setNumeroAsiento(i);
                s.setIdBus(busService.listarTodos().get(busService.listarTodos().size() - 1));

                asientoService.Guardar(s);
            }

            return "redirect:/asientos/" + (busService.listarTodos().get(busService.listarTodos().size() - 1).getId());
        } else {
            return "redirect:/asientos/" + idViaje;
        }

    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Viaje viaje) {

        viajeService.Guardar(viaje);
        System.out.println("Cliente guardado con exito");
        return "redirect:/viajes";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") int idViaje, Model model) {

        Viaje viaje = viajeService.buscarPorId(idViaje);

        List<Viaje> listaViajes = viajeService.listarTodos();
        List<Ciudad> listaCiudades = ciudadService.listarTodos();
        model.addAttribute("ciudades", listaCiudades);
        model.addAttribute("listaViajes", listaViajes);
        model.addAttribute("nuevoViaje", viaje);
        model.addAttribute("titulo", "Editar Viaje");

        return "agregarViaje";

    }

}
