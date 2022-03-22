package gt.edu.umg.progra3.colas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class AutoServicio {

    private Cola cola;

    
    
    
    public  AutoServicio(Cola cola) {
        this.cola = cola;
    }

    /**
     * debe retornar el auto que esta en turno, sin sacarlo de la cola
     * @param placa
     * @return
     */
    public String ingresarAuto(String placa){
        this.cola.enqueue(placa);
        return null;
    }

    public static String proximoAuto(List<String> values){
        
        if(values.isEmpty()){
                        System.out.println("\n NO HAY AUTOS EN LA COLA \n");

        }else{
                System.out.println("\n AUTO CON PLACA \"" + values.get(0) + "\" ESTA EN TURNO DE REPARACION");
        }
        return null;
    }

    /**
     * debe retornar el auto a entregar y sacarlo de la cola
     * @param values
     * @return
     */
    public static String entregarAuto(List<String> values){
                if(values.isEmpty()){
                        System.out.println("\n NO HAY AUTOS EN LA COLA \n");

        }else{
          System.out.println("\n AUTO CON PLACA \"" + values.get(0) + "\" REPARADO Y DESPACHADO");
                
        values.remove(0);
        
         if(!values.isEmpty()){
         System.out.println("\n TURNO DEL AUTO\"" + values.get(0) + "\"");
         System.out.println("\n COLA DE AUTOS" + values+ "\n");
         }else{
            System.out.println("\n NO HAY AUTOS EN LA COLA \n");


         }
                
        
        }
        return null;
    }

    public static int obtenerAutosEnCola(List<String> values){
                  
                if(values.isEmpty()){
                        System.out.println("\n NO HAY AUTOS EN LA COLA \n");

        }else{
        int a = values.size();

         System.out.println("\n AUTO en cola \"" + a + "\n Listado: " + values);
                }
         return 0;
    }
}
