
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author mario
 */

@Data
@Entity
@Table(name="carrito")
public class Carrito implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito;
    private Long idCliente;

    public Carrito() {
    }

    public Carrito(Long idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
}
