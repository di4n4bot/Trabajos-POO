/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diana
 */
public class servicioTarea {

    private List<tarea> listatarea = new ArrayList();

    public tarea crear(tarea tarea) {
        listatarea.add(tarea);
        return tarea;
    }

    public tarea crear(String descripcion) {
        tarea tarea = new tarea(descripcion);
        listatarea.add(tarea);
        return tarea;
    }

    public void marcar(tarea tarea) {
        for (tarea _tarea : listatarea) {
            if (tarea.getDescripcion().equalsIgnoreCase(tarea.getDescripcion())) {
                _tarea.setDescripcion("completada");
            }
        }

    }
   public void mostrarTarea (){
   for (tarea tarea : listatarea){
       System.out.println("Descripcion" + tarea.getDescripcion());
       System.out.println("Fecha" + tarea.getFecha());
       System.out.println("Estado" + tarea.getEstado());
   }
   }
   
   public boolean eliminarTarea (tarea tarea){
   List <tarea> _listatarea = new ArrayList ();
   for(tarea _tarea : listatarea){
   if(! _tarea.getDescripcion().equalsIgnoreCase(tarea.getDescripcion())){
   _listatarea.add(_tarea);
   }
   
   } 
   listatarea=_listatarea;
   return true;
   
   }
   
   public void listarTarea (){
   for (int i = 1; i<=listatarea.size(); i++) {
       System.out.println(i + ".-" + listatarea.get(i-1).getDescripcion());
   }
   }
   public tarea obtener (int i){
   return listatarea.get(i);
   }
   public void marcarCompletada (int indice){
   listatarea.get(indice).setEstado("Completado");
   }
   public List <tarea> obtenertareas(){
   return listatarea;
   }
   public boolean tareaCompleta (String descripcion){
   for (tarea _tarea : listatarea){
   if (_tarea.getDescripcion().equalsIgnoreCase(descripcion)){
       return _tarea.getEstado().equalsIgnoreCase("completada");
   
   }
   }
   return false;
   }
   
   public void eliminarTarea (int indice){
   List <tarea> _listatarea = new ArrayList ();
   for(int i=0 ; 1 < listatarea.size(); i++){
   if(indice    !=i){
   _listatarea.add(listatarea.get(i));
   }
   }
   listatarea = _listatarea;
   }
}
