
package com.jp1.terminal_spring.dao;

import com.jp1.terminal_spring.modelo.Asiento;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface AsientoDao extends CrudRepository<Asiento, Integer> {

    @Override
    public List<Asiento> findAll();

}
