
package com.jp1.terminal_spring.services;

import com.jp1.terminal_spring.dao.ViajeDao;
import com.jp1.terminal_spring.modelo.Viaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeServiceImple implements ViajeService {

    @Autowired
    private ViajeDao viajeDao;
    
    @Override
    public List<Viaje> listarTodos() {
        return viajeDao.findAll();
    }

    @Override
    public void Guardar(Viaje viaje) {
        viajeDao.save(viaje);
    }

    @Override
    public Viaje buscarPorId(Integer id) {
        return viajeDao.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Integer id) {
        viajeDao.deleteById(id);
    }
    
}
