package com.tienda.controller;

import com.tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    
    @Autowired
    ProductoService productoService;
    
    @RequestMapping("/")
    public String page(Model model) { 
        var listaProductos = productoService.getProductos(true);
        model.addAttribute("productos", listaProductos);
        return "index";
    }
    
}
