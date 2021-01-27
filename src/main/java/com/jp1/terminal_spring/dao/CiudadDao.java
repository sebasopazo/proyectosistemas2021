
package com.jp1.terminal_spring.dao;

import com.jp1.terminal_spring.modelo.Ciudad;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CiudadDao extends CrudRepository<Ciudad, Integer> {

    @Override
    public List<Ciudad> findAll();
    
    
}
