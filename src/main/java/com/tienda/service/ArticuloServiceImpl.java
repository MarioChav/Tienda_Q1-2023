
package com.tienda.service;

import com.tienda.dao.ArticuloDao;
import com.tienda.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service     //NECESITA ANOTACION DE SERVICE PARA QUE FUNCIONE LA IMPLEMENTACION(Impl)
public class ArticuloServiceImpl implements ArticuloService {
    
    @Autowired
    ArticuloDao articuloDao;

    @Override
    @Transactional(readOnly = true) // Para manejar transacciones de solo lectura
    public List<Articulo> getArticulos(boolean activos) {
        var lista= (List<Articulo>)articuloDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true) // Para manejar transacciones de solo lectura
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Articulo articulo) {
        articuloDao.save(articulo);
    }

    @Override
    @Transactional
    public void delete(Articulo articulo) {
        articuloDao.deleteById(articulo.getIdArticulo());
    }
}
