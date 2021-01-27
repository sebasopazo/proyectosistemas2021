
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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
@RequestMapping("/")
public class AsientoController {
    
    @Autowired
    private AsientoService asientoService;
    
    @Autowired
    private BusService busService;
    
    @GetMapping("/asientos/{id}")
    public String muestraAsientos(@PathVariable("id") int idBus,Model model) {

        Bus bus=busService.buscarPorId(idBus);
        
        List<Asiento> seleccionados=new ArrayList<>();
        
        List<Asiento> priFila=new ArrayList<>();
        List<Asiento> segFila=new ArrayList<>();
        List<Asiento> terFila=new ArrayList<>();
        List<Asiento> cuarFila=new ArrayList<>();
        List<Asiento> quinFila=new ArrayList<>();
        List<Asiento> sexFila=new ArrayList<>();
        List<Asiento> sepFila=new ArrayList<>();
        List<Asiento> octFila=new ArrayList<>();
        List<Asiento> novFila=new ArrayList<>();
        List<Asiento> listaAsientos=asientoService.listarTodos();
        
        for (int i = 0; i < listaAsientos.size(); i++) {
            if (listaAsientos.get(i).getIdBus().getId()==idBus) {
                seleccionados.add(listaAsientos.get(i));
            }
        }
        
        
        for (int i = 0; i < seleccionados.size(); i++) {
            if (i<=3) {
                priFila.add(seleccionados.get(i));
            }else if(i>3&&i<=7){
                segFila.add(seleccionados.get(i));
            }
            else if(i>7&&i<=11){
                terFila.add(seleccionados.get(i));
            }
            else if(i>11&&i<=15){
                cuarFila.add(seleccionados.get(i));
            }
            else if(i>15&&i<=19){
                quinFila.add(seleccionados.get(i));
            }
            else if(i>19&&i<=23){
                sexFila.add(seleccionados.get(i));
                
            }else if(i>23&&i<=27){
                sepFila.add(seleccionados.get(i));
            }
            else if(i>27&&i<=31){
                octFila.add(seleccionados.get(i));
            }
            else if(i>31&&i<=35){
                novFila.add(seleccionados.get(i));
            }
            
        }
        
        model.addAttribute("largo", idBus);
        model.addAttribute("numInf", seleccionados.get(0).getId());
        model.addAttribute("numSup", seleccionados.get(35).getId());
        model.addAttribute("priFila", priFila);
        model.addAttribute("segFila", segFila);
        model.addAttribute("terFila", terFila);
        model.addAttribute("cuarFila", cuarFila);
        model.addAttribute("quinFila", quinFila);
        model.addAttribute("sexFila", sexFila);
        model.addAttribute("sepFila", sepFila);
        model.addAttribute("octFila", octFila);
        model.addAttribute("novFila", novFila);

        return "Asientos";

    }
    
//    @GetMapping("/agregarAsiento") //nombre en el url
//    public String crear(Model model) {
//        List<Bus> listaBuses=busService.listarTodos();
//        Asiento asiento=new Asiento();
//        
//        model.addAttribute("buses", listaBuses);
//        model.addAttribute("nuevoAsiento", asiento);
//        model.addAttribute("titulo", "Agregar Asiento");
//
//        return "confimarAsiento";
//
//    }
    
    @PostMapping("/guardarAsiento")
    public String guardar(@ModelAttribute Asiento asiento){
        
        asientoService.Guardar(asiento);
        System.out.println("Asiento guardado con exito");
        return "redirect:/home";
    }
    
    @GetMapping("/confirmarPasajes/{id}") 
    public String editar( @PathVariable("id") int idAsiento,Model model) {
        
        Asiento asiento=asientoService.buscarPorId(idAsiento);
        

        model.addAttribute("nuevoAsiento", asiento);
        model.addAttribute("titulo", "Confimar Asiento comprado");

        return "confimarAsiento";

    }

}
