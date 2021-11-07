/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4.reto4.repositorio;

import reto4.reto4.interfaces.InterfaceReservation;
import reto4.reto4.modelo.Reservacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioReservacion {
    @Autowired
    private InterfaceReservation crud4;
    
    public List<Reservacion> getAll(){
        return (List<Reservacion>) crud4.findAll();
    }
    public Optional<Reservacion> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservacion save(Reservacion reservacion){
        return crud4.save(reservacion);
    }
     public void delete(Reservacion reservacion){
        crud4.delete(reservacion);
    }
}
