
package com.jp1.terminal_spring.services;

import com.jp1.terminal_spring.modelo.Viaje;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ViajeService{
    
    public List<Viaje> listarTodos();
    public void Guardar(Viaje viaje);
    public Viaje buscarPorId(Integer id); 
    public void eliminar(Integer id);
    
}
