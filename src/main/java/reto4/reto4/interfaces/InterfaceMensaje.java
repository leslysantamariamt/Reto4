/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4.reto4.interfaces;

import reto4.reto4.modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
