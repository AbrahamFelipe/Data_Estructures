/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import estructures.DoublyLinkedList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ABRAHAM
 */
public class Conteo2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //entradas
        String[] logs = entrada.nextLine().replace("[", "").replace("]", "").split(",");
        int k = entrada.nextInt();
        
        int[] logsInt = new int[logs.length];
        int[][] logsBidi = new int[logsInt.length/2][2];     
        DoublyLinkedList<int[]> lista = new DoublyLinkedList<>();
        try {
            for(int i=0,j=0; i<logsInt.length;i+=2,j++){
                logsInt[i] = Integer.parseInt(logs[i]);//pasar de String a lista de Int
                logsInt[i+1] = Integer.parseInt(logs[i+1]);
                int[] newArr = Arrays.copyOfRange(logsInt, i,i+2);//pasar array a arreglo bidimensional 
                logsBidi[j]=newArr; 
                lista.addLast(logsBidi[j]);//insertar arreglo bidimensional en lista
            }
        }catch (Exception e) {
            System.out.println("error en la cadena");
        }
        //crear lista respuesta 
        DoublyLinkedList<Integer> respuesta = new DoublyLinkedList<>();
        for(int i=0; i<k;i++){
            respuesta.addLast(0);
        }
        
        
       //logica//eliminar
        for(int i=0;i<lista.size();i++){
            if(lista.getElement(i)!=null){
                int id = lista.getElement(i)[0];
                int min = lista.getElement(i)[1];
                int mau = 1;
                DoublyLinkedList<Integer> minRep = new DoublyLinkedList<>();
                minRep.addLast(min);
                for(int j=0; j<lista.size();j++){
                    if(lista.getElement(j)!=null){ 
                        if(id == lista.getElement(j)[0]){//verifica si es el mismo usuario/ID
                            if( !minRep.search(lista.getElement(j)[1])){//verifica que un minutos solo se repita una vez
                                mau++;
                                minRep.addLast(lista.getElement(j)[1]);   
                            }
                            lista.set(j, null);
                        }
                    }
                }
                if(mau<=k){
                    respuesta.set(mau-1, respuesta.getElement(mau-1)+1);
                }
                
            }
        }
        
        
        if(k>0){
        //imprimir en el formato necesario
        String respuestaF ="[";
        for(int i =0;i<respuesta.size();i++){
            if(i==respuesta.size()-1){
                respuestaF +=respuesta.getElement(i)+"]";
                break;
            }
            respuestaF +=respuesta.getElement(i)+",";
        }
        System.out.print(respuestaF);
        }
        
        
    }
    
    
}
