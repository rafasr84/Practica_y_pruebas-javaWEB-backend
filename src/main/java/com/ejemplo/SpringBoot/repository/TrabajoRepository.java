
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajoRepository extends JpaRepository <Trabajo, Long> {
    
}
