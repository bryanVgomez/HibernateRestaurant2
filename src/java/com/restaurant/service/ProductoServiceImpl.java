/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.service;

import com.restaurant.entiy.Producto;
import com.restaurant.repository.Helpers;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Connectis
 */

@Path("/api")
public class ProductoServiceImpl {

    Helpers helpers;
    
    
    @GET
    @Path("/producto")
    @Produces ("application/json")
    
    public List<Producto> obtenerProductos() {
        List<Producto> productos = helpers.getProductos();
        return productos;
    }
    
}
