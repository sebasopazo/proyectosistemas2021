
package com.jp1.terminal_spring.services;

import com.jp1.terminal_spring.modelo.Bus;
import java.util.List;

public interface BusService {
    
    public List<Bus> listarTodos();
    public Bus buscarPorId(Integer id); 
    public void Guardar(Bus bus);
    
}
