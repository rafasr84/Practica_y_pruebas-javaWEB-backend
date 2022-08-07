
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String institucion;
    private String ciudad;
    private String fechaInicio;
    private String fechaFinal;
    
    public Estudio () {
    }
    public Estudio(Long id, String titulo, String institucion, String ciudad, String fechaInicio, String fechaFinal){
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.ciudad = ciudad;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        
}
}
