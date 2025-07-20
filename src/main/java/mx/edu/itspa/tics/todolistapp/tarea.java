/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp;

import java.time.LocalDate;

/**
 *
 * @author diana
 */
public class tarea {
    private String descripcion;
    private LocalDate fecha;
    private String estado;
    
     public String getDescripcion (){
     return descripcion;
     
     }
     
     public void setDescripcion (String descripcion){
     this.descripcion = descripcion;
     }
     public LocalDate getFecha(){
     return fecha;
     
     }
     public void setFecha (LocalDate fecha){
     this.fecha = fecha ;
     }
     public String getEstado (){
     return estado;
     
     }
     
     public void setEstado (String estado){
     this.estado = estado;
     }
     
    public tarea (String descripcion) {
    this.descripcion = descripcion;
    this.fecha = LocalDate.now();
    this.estado = "pendiente";
    }
    
    
     
}
