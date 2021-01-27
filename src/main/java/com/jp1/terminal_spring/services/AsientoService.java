
package com.jp1.terminal_spring.services;

import com.jp1.terminal_spring.modelo.Asiento;
import java.util.List;


public interface AsientoService {
    
    public List<Asiento> listarTodos();
    public void Guardar(Asiento asiento);
    public Asiento buscarPorId(Integer id); 
    
}
