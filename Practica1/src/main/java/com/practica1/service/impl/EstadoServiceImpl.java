package com.practica1.service.impl;

import com.practica1.dao.EstadoDao;
import com.practica1.domain.Estado;
import com.practica1.service.EstadoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImpl implements EstadoService {
    @Autowired
    private EstadoDao estadoDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Estado> getEstados() {
        return estadoDao.findAll();
    }
    
    @Override
    @Transactional(readOnly=true)
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }
    
    @Override
    @Transactional
    public void delete(Estado estado) {
        estadoDao.delete(estado);
    }
}
