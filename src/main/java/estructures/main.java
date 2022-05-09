/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructures;



/**
 *
 * @author ABRAHAM
 */
public class main {
    
    public static void main(String[] args) {
        
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();
        
        lista.addLast(56);
        lista.addLast(467);
        lista.addLast(4);
        lista.addLast(5);
        lista.output();
        System.out.println("-------------------");
        lista.set(2, -11);
        lista.output();
  
      
        
        System.out.println("head: "+lista.getFirst());
        System.out.println("tail: "+lista.getLast());
        System.out.println("tamaño: "+lista.size());
        System.out.println("elemento especifico: "+lista.getElement(2));
        System.out.println(lista.search(-11));
        
        
        
        
        
        
        
        
        

        
       
        
      
        
        
        
       
        
    }
    
}
