
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository <Estudio, Long> {
    
    
}
