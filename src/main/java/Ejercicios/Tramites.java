/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import estructures.QueueArray;
import java.util.Scanner;

/**
 *
 * @author ABRAHAM
 */
public class Tramites {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //System.out.println("Ingrese estrcutura ");
        String[] requerimientos = entrada.nextLine().replace("[", "").replace("]", "").split(",");
        
        //System.out.println("Ingrese k ");
        int k = entrada.nextInt();
        
        
        
        //String[] requerimientos = {"2","3","2"};
        
        
        QueueArray<Integer> cola = new QueueArray<>(requerimientos.length);//cola con tamaño de la estrcutura original
        
        //pasar array a la cola
        for(int i = 0; i<requerimientos.length;i++){
            cola.enqueue(Integer.parseInt(requerimientos[i])); 
        }
        
        //int k = 2;
        int tiempo = 0;
        int ite = 0;
        //cola.print(); 
        
        while(true){
                
            int item = cola.dequeue();
            item = item-1;
            tiempo++;  
            ite++;
            if(ite==k+1){
                int elegido = item;
                k = cola.getCount();
                ite=0;
                if(elegido==0){
                    break;
                }
            }
            if(item >0){
                cola.enqueue(item);
            }
            //cola.print();   
        }
        //System.out.println("tiempo "+tiempo);
        System.out.println(tiempo);
        
       
        
    }
    
}
