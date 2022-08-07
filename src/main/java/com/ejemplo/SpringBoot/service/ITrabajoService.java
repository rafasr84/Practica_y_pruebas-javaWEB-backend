
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Trabajo;
import java.util.List;


public interface ITrabajoService {
    
    public List<Trabajo> verTrabajos ();
    public void crearTrabajo(Trabajo tra);
    public void borrarTrabajo(Long id);
    public Trabajo buscarTrabajo (Long id);                        
    
}
