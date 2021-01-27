
package com.jp1.terminal_spring.dao;

import com.jp1.terminal_spring.modelo.Viaje;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ViajeDao extends CrudRepository<Viaje, Integer> {

    @Override
    public List<Viaje> findAll(); 

}
