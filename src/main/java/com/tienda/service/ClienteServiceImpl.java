
package com.tienda.service;

import com.tienda.dao.ClienteDao;
import com.tienda.dao.CreditoDao;
import com.tienda.domain.Cliente;
import com.tienda.domain.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service     //NECESITA ANOTACION DE SERVICE PARA QUE FUNCIONE LA IMPLEMENTACION(Impl)
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    ClienteDao clienteDao;
    
    @Autowired
    CreditoDao creditoDao;

    @Override
    @Transactional(readOnly = true) // Para manejar transacciones de solo lectura
    public List<Cliente> getClientes() {
        return (List<Cliente>)clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true) // Para manejar transacciones de solo lectura
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito = cliente.getCredito();
        credito = creditoDao.save(credito);
        cliente.setCredito(credito);
        
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }
}
