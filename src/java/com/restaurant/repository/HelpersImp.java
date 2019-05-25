/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.repository;

import com.restarurant.util.HibernateUtil;
import com.restaurant.entiy.Producto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Connectis
 */
public class HelpersImp implements Helpers{

    Session session= null;
    
    @Override
    public List <Producto> getProductos() {
        
        List <Producto> producto = new ArrayList();
        
        Query q = session.createQuery("from Producto");
        producto = (List<Producto>) q.list();
        
        return producto;
        
    }

    public HelpersImp() {
        
        this.session = session.getSessionFactory().openSession();
    }
    
    
    
    
    
    
}
