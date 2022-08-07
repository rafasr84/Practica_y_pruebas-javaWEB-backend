
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Trabajo {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String posicion;
    private String empresa;
    private String ciudad;
    private String fechaInicio;
    private String fechaFinal;
    private String descripcion;


public Trabajo(){

}

public Trabajo(Long id, String posicion, String empresa, String ciudad, String fechaInicio, String fechaFinal, String descripcion){
        this.id = id;
        this.posicion = posicion;
        this.empresa = empresa;
        this.ciudad = ciudad;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.descripcion=descripcion;

}
}




