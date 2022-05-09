/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;
import estructures.DoublyLinkedList;
import java.util.Scanner;

/**
 *
 * @author ABRAHAM
 */
public class Caja {
    
    public static void main(String[] args) {
        
        DoublyLinkedList lista = new DoublyLinkedList();
        DoublyLinkedList respuesta = new DoublyLinkedList();
        
        Scanner entrada = new Scanner(System.in);
        
        //System.out.println("Ingrese estructura ");
        String[] cajas = entrada.nextLine().replace("\"", "").split("");
        
        //pasar array a la lista
       for (String bola : cajas) {
            lista.setTail(Integer.parseInt(bola)); 
            
        }
        
       
       
       for(int posicion = 0; posicion<lista.getCount();posicion++){
           int dif = 0;
           for(int i = 0; i<lista.getCount();i++){//reccore lista
               
               int dato = lista.getData(i);
               if(dato == 1){
                   dif += Math.abs(posicion-i);
               }

           }
           respuesta.setTail(dif);

       }
       
        //imprimir en el formato necesario
        String respuestaF ="[";
        for(int i =0;i<respuesta.getCount();i++){
            if(i==respuesta.getCount()-1){
                respuestaF +=respuesta.getData(i)+"]";
                break;
            }
            respuestaF +=respuesta.getData(i)+",";
        }
        System.out.println(respuestaF);

    }
    
}
