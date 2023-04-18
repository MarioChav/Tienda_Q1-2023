
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author mario
 */

@Data
@Entity
@Table(name="rol")
public class Rol implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol; 
    
    @NotEmpty
    private String nombre;
    
}
