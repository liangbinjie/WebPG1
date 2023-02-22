package com.practica1.service;

import com.practica1.domain.Estado;
import java.util.List;


public interface EstadoService {
    public List<Estado> getEstados();
    public Estado getEstado(Estado estado);
    public void save(Estado estado);
    public void delete(Estado estado);
}
