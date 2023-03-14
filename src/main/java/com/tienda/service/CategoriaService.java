
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos); //es para inactivar una categoria con activos o no 
    
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria);  
    
    public void delete(Categoria categoria);
    
}
