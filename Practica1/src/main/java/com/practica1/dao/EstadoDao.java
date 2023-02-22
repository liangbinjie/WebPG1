package com.practica1.dao;

import com.practica1.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EstadoDao extends JpaRepository <Estado, Long>{
    
}
