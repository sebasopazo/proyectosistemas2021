
package com.jp1.terminal_spring.services;

import com.jp1.terminal_spring.dao.BusDao;
import com.jp1.terminal_spring.modelo.Bus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImple implements BusService {

    @Autowired
    private BusDao busDao;
    
    @Override
    public List<Bus> listarTodos() {
        return busDao.findAll();
    }

    @Override
    public Bus buscarPorId(Integer id) {
       return busDao.findById(id).orElse(null);
    }

    @Override
    public void Guardar(Bus bus) {
        busDao.save(bus);
    }
    
    
    
}
