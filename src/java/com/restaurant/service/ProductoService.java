/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.service;

import com.restaurant.entiy.Producto;
import java.util.List;

/**
 *
 * @author Connectis
 */
public interface ProductoService {
    
        List<Producto> obtenerProductos();
}
