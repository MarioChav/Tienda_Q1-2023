
package com.tienda.service;

import com.tienda.domain.Carrito;

/**
 *
 * @author mario
 */


public interface CarritoService {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(Long idCliente);
    
}
