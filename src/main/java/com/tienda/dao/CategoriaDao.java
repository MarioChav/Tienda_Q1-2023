
package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mario
 */
public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
