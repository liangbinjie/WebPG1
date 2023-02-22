package com.practica1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idEstado;
    
    private String nombreEstado;
    private int numProvincias;
    private boolean costas;
    private int poblacion;
    
    public Estado() {
        
    }

    public Estado(Long idEstado, String nombreEstado, int numProvincias, boolean costas, int poblacion) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
        this.numProvincias = numProvincias;
        this.costas = costas;
        this.poblacion = poblacion;
    }
            
}
