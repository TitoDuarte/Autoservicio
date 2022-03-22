/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gt.edu.umg.progra3.colas;

import static gt.edu.umg.progra3.colas.AutoServicio.entregarAuto;
import static gt.edu.umg.progra3.colas.AutoServicio.obtenerAutosEnCola;
import static gt.edu.umg.progra3.colas.AutoServicio.proximoAuto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
/**
 *
 * @author Humberto Duarte
 */
public class main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        System.out.println("Hello World!");
     
        boolean cicloLista = true;
        Scanner leer = new Scanner(System.in);
        List<String> arrayListInt = new ArrayList();
        List<Integer> resultado = new ArrayList(); 
      
        int respuesta;
        String placa;
        
        
        while(cicloLista == true){
        
    
        
          System.out.println("¿Que desea realizar? \n 1. Ingresar Auto \n 2. Despachar Auto \n 3. Mostrar auto en turno \n  4. Mostrar autos ingresados \n 5. Salir");
          respuesta = leer.nextInt();
     
                    if(respuesta == 1 ){

                              System.out.println("\n Ingresar placa del Auto");
                              leer.nextLine();
                              placa = leer.nextLine();   
                                arrayListInt.add(placa);
                              System.out.println("\n AUTO INGRESADO A LA COLA " + arrayListInt);

                    }      
                    else if (respuesta == 2){
                        
                          entregarAuto(arrayListInt);    
                    }
                    
                      else if (respuesta == 3){
                        
                          proximoAuto(arrayListInt);    
                    }
                    
                       else if (respuesta == 4){
                        
                          obtenerAutosEnCola(arrayListInt);    
                    }
                
                       else if (respuesta == 5)
                    {
                    cicloLista = false;
                                    System.out.println("\n Hasta luego");
                    }else{
                                                           System.out.println("\n OPCION NO EXISTE\n ");

                       }
      
                
 }//fin de ciclo 
     
     }
     
    
}
