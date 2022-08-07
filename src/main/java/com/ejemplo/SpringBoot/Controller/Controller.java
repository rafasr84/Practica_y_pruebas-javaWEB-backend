
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Estudio;
import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.model.Trabajo;
import com.ejemplo.SpringBoot.service.IEstudioService;
import com.ejemplo.SpringBoot.service.IPersonaService;
import com.ejemplo.SpringBoot.service.ITrabajoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
   @Autowired
   private IPersonaService persoServ;
    
    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
        
               
    
        
    @Autowired
   private IEstudioService estudServ;
    
    @PostMapping("/new/estudio")
    public void agregarEstudio (@RequestBody Estudio est){
        estudServ.crearEstudio(est);
    }
    
    @GetMapping("/ver/estudios")
    @ResponseBody
    public List<Estudio> verEstudios(){
        return estudServ.verEstudios();
    }
        
    @DeleteMapping("/delete/estudio{id}")
    public void borrarEstudio(@PathVariable Long id) {
        estudServ.borrarEstudio(id);
    }
    
    
    
    
    @Autowired
   private ITrabajoService trabaServ;
    
    @PostMapping("/new/trabajo")
    public void agregarTrabajo (@RequestBody Trabajo tra){
        trabaServ.crearTrabajo(tra);
    }
    
    @GetMapping("/ver/trabajos")
    @ResponseBody
    public List<Trabajo> verTrabajos(){
        return trabaServ.verTrabajos();
    }
        
    @DeleteMapping("/delete/trabajo{id}")
    public void borrarTrabajo(@PathVariable Long id) {
        trabaServ.borrarTrabajo(id);
    }
}
