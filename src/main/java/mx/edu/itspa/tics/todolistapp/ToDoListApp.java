/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itspa.tics.todolistapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author diana
 */
public class ToDoListApp {
        // BUFFEREADER SIRVE PARA LEER EL TECLADO
static BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
static servicioTarea serviceTask = new servicioTarea();

//Método principal que inicia la ejecución del programa.
public static void main (String[] args){
    
 //Variable que guarda la opción elegida por el usuario del menú principal.
int opcionseleccionada =0;
//Dentro del try, se ejecuta un ciclo do-while que muestra el menú y ejecuta la opción seleccionada
try {
do{
mostrarmenu();
manejarOpcionSeleccionada();
opcionseleccionada = manejarOpcionSeleccionada();

} while (opcionseleccionada !=5);

//Captura cualquier error de entrada (como si el usuario escribe texto en vez de un número).
} catch (IOException e){
    System.out.println("Entrada no valida");
} finally {
try{
leer.close();
} catch (IOException e){
    System.out.println("Erro al cargar");
}
}
}

    private static void mostrarmenu() {
        System.out.println("Aplicacion To Do List");
        System.out.println("selecciona una opcion valida");
        System.out.println("1.- crear una tarea");
        System.out.println("2.- mostrar tarea");
        System.out.println("3.- completar tarea");
        System.out.println("4.- eliminar tarea");
        System.out.println("5.-. salir");
    }
    //Este método se encarga de leer la opción del usuario y ejecutar la acción correspondiente.
    public static int manejarOpcionSeleccionada () throws IOException {
    // SIRVE PARA CONTROLAR LAS OPCIONES DEL MENU
    int opcionseleccionada = 0;
    
    
    tarea tarea;
    //Lee la entrada del usuario y la convierte en un número entero.
    opcionseleccionada = Integer.parseInt(leer.readLine());
    
       switch (opcionseleccionada){
           //Pide al usuario que escriba una nueva tarea y la envía al método crear.
           case 1: {
               System.out.println("Ingresa la tarea");
               System.out.println(">");
               serviceTask.crear(leer.readLine());
           }
           //Llama al método que muestra todas las tareas.
           case 2 :{
           serviceTask.mostrarTarea();
           
           }
           //Lista las tareas, luego pide el número de una tarea para marcarla como completada.
           case 3 : {
           serviceTask.listarTarea();
               System.out.println("Ingresa el numero de la tarea a marcar");
               int indicetarea = Integer.parseInt(leer.readLine());
               tarea _tarea = serviceTask.obtener(indicetarea - 1);
               serviceTask.marcar(_tarea);
 
           }   
           case 4 :{}
           
           case 5 : {}
           
           
       } 
        //Devuelve la opción que el usuario seleccionó, para que el main sepa si debe salir del bucle.
        return opcionseleccionada;
    }
  
}
