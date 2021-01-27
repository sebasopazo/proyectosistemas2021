
package com.jp1.terminal_spring.services;

import com.jp1.terminal_spring.dao.CiudadDao;
import com.jp1.terminal_spring.modelo.Ciudad;
import com.jp1.terminal_spring.modelo.Viaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImple implements CiudadService {

    @Autowired
    private CiudadDao ciudadDao;

    @Override
    public List<Ciudad> listarTodos() {
        return ciudadDao.findAll();
    }
    

    
}
