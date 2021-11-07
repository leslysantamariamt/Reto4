/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4.reto4.interfaces;

import reto4.reto4.modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceReservation extends CrudRepository<Reservacion,Integer>{
    
}
