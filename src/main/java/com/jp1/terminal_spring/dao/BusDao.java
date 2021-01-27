
package com.jp1.terminal_spring.dao;

import com.jp1.terminal_spring.modelo.Bus;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface BusDao extends CrudRepository<Bus, Integer> {

    @Override
    public List<Bus> findAll();
    
    
}
