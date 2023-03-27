package com.tienda.dao;

import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
    List<Cliente> findByCorreo(String correo); //se puede hacer findTop1ByCorreo para buscar el primer correo de la lista
    
    List<Cliente> findByNombreAndApellidos(String nombre, String apellidos);  //Se puede hacer findByNombreOrApellidos para que filtre por uno o por otro
    
    List<Cliente> findByApellidos(String apellidos);
    
}
