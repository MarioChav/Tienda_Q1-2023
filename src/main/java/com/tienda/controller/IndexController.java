package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        
        /*
        String mensaje= "Estamos en semana 4";
        model.addAttribute("MensajeSaludo", mensaje);
        
        
        
        Cliente cliente = new Cliente("Mario", "Chavarria Roque", "mchavarria@gmail.com", "8888888");
        Cliente cliente2 = new Cliente("Juan", "Roque Chavarria", "jroque@gmail.com", "7777777");
        
        //model.addAttribute("cliente", cliente);
        List<Cliente> clientes = Arrays.asList(cliente, cliente2);
        model.addAttribute("clientes", clientes);
        */
        
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
    
}
