
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Trabajo;
import com.ejemplo.SpringBoot.repository.TrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoService implements ITrabajoService{
    
    @Autowired
    public TrabajoRepository trabaRepo;

    @Override
    public List<Trabajo> verTrabajos() {
        return trabaRepo.findAll();
    }

    @Override
    public void crearTrabajo(Trabajo tra) {
        trabaRepo.save(tra);
    
    }

    @Override
    public void borrarTrabajo(Long id) {
        trabaRepo.deleteById(id);

    }

    @Override
    public Trabajo buscarTrabajo(Long id) {
        return trabaRepo.findById(id).orElse(null);

    }
       
    
}
