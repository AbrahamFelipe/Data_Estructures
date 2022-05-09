/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructures;

/**
 *
 * @author ABRAHAM
 */
public class LinkedListOrdered extends List {
    private Node<Integer> head;
    
    public LinkedListOrdered(){
        head = null;
    }

    @Override
    public Boolean empty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean full() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(int item) {
        boolean deleted=false;
        Node<Integer> ptr,prev;
        ptr = head;
        prev = null;
        while(ptr != null && ptr.getData()<item) {
            prev = ptr;
            ptr = ptr.getNext();
        }
        if(ptr.getData()==item){
            
            if(prev!=null){
                prev.setNext(ptr.getNext());
                deleted = true;
            
            } else{
                head = head.getNext();
            }
        }  
        return deleted;
    }

    @Override
    public Boolean insert(int item) {
        boolean inserted;
        Node<Integer> ptr,prev;
        inserted = false;
        ptr = head;
        prev = null;
        while(ptr != null && ptr.getData()<item) {
            prev = ptr;
            ptr = ptr.getNext();
        }
        if (ptr == null || ptr.getData() != item) {
            inserted = true;
            Node newp = new Node();
            newp.setData(item);
            newp.setNext(ptr);
            if(prev == null){
                head = newp;
            } else{
            prev.setNext(newp);
            }
            
        }
        return inserted;
    }
    
    
    
    private void printR(Node p) {
        if(p != null) {
            System.out.print(p.getData()+" ");
            printR(p.getNext());
        }
    }

    @Override
    public Boolean search(int item) {
        throw new UnsupportedOperationException("No es necesaria en esta clase."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void output() {
        System.out.print("Lista: ");
        printR(head);
        System.out.println();
    }
    
}
