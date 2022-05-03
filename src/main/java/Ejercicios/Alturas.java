/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import estructures.QueueRef;
import java.util.Scanner;

/**
 *
 * @author ABRAHAM
 */
public class Alturas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //System.out.println("Ingrese estructura ");
        //String[] alturas = entrada.nextLine().replace("[", "").replace("]", "").split(",");
        
        String[] alturas = {"10","6","8","5","11","9"};
        
        
        
        QueueRef<Integer> cola = new QueueRef<>();
        
        QueueRef<Integer> respuesta = new QueueRef<>();

        //pasar array a la cola
        for (String altura : alturas) {
            cola.enqueue(Integer.parseInt(altura)); 
            
        }

        int tamañoOri = cola.getCount();
        
        for(int x = 0; x<tamañoOri-1;x++){
            //valores inicial
            int itemAnalizar = cola.dequeue();//entero 10 posicion 0
            int tamaño = cola.getCount();
            int item;
            int item_1=-1;
            int maximo=-1;
            int minimo;
            int suma = 0;
            
            
            for(int i = 0; i<tamaño;i++){//recorre el resto de posiciones de la cola
                item = cola.dequeue();//item que recorrera 
                maximo = Math.max(maximo, item_1);
                item_1= item;
                minimo = Math.min(itemAnalizar,item);
                if(minimo>maximo || i==0){
                    suma++;
                }
                cola.enqueue(item);
                
            }
           
            respuesta.enqueue(suma);
        
        }
        respuesta.enqueue(0);//ultimo valor agregado en cualquier entrada
        
        
        
        //imprimir en el formato necesario
        String respuestaF ="[";
        for(int i =0;i<tamañoOri;i++){
            if(i==tamañoOri-1){
                respuestaF +=respuesta.dequeue()+"]";
                break;
            }
            respuestaF +=respuesta.dequeue()+", ";
        }
        System.out.println(respuestaF);
        
        
    }
    
    
    
}
