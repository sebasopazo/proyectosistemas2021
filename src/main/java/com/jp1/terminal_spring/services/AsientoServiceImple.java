
package com.jp1.terminal_spring.services;

import com.jp1.terminal_spring.dao.AsientoDao;
import com.jp1.terminal_spring.modelo.Asiento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsientoServiceImple implements AsientoService {
    
    @Autowired
    private AsientoDao asientoDao; 
    
    @Override
    public List<Asiento> listarTodos() {
        return asientoDao.findAll();
    }

    @Override
    public Asiento buscarPorId(Integer id) {
        return asientoDao.findById(id).orElse(null);
    }

    @Override
    public void Guardar(Asiento asiento) {
        asientoDao.save(asiento);
    }
    
}
