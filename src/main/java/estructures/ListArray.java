/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructures;

/**
 *
 * @author ABRAHAM
 */
public class ListArray extends List {
    
    private int N, count, position;

    
    private int[] array;
    
    
    //contructores
    public ListArray(){
        this(4);//tamaño por defecto
        
    }
    
    public ListArray(int N) {
        this.N = N;
        count=0;
        array = new int[this.N];
    }

    @Override
    public Boolean empty() {
        return count<=0;
    }

    @Override
    public Boolean full() {
        return count>=N;
    }

    
    
    @Override
    public Boolean delete(int item) {
        boolean deleted=false;
        if(!empty()){
            if(search(item)) {
                for(int i=position; i<count-1; i++){
                    array[i] = array[i+1];
                }  
                count--;
                deleted = true;
            } else{
                System.out.println("El numero " + item + " no esta en la lista");  
            }
        } else {
            System.out.println("Lista vacia");
            
        }
        return deleted;
    }
    
    

    @Override
    public Boolean insert(int item) {  
        boolean inserted=false;
        if(!full()){
            if(!search(item)) {//esta parte hace que el codigo no acepte numeros duplicados
                for(int i=count; i>position; i--){
                    array[i] = array[i-1];
                }
                array[position] = item;
                count++;
                inserted = true;
            } else{
                System.out.println("El numero ya esta en la lista, no se aceptan duplicados");
            }
        }else{
            System.out.println("Lista llena");
        }
        return inserted;
    }

 
    @Override
    public Boolean search(int item) {
        
        boolean found=false;
        boolean stop=false;
        position = 0;
        while(position < count && !stop){
            if(array[position] >= item) {//parte que lo hace ordenada
                stop = true;
                if(array[position] == item){
                    found = true;
                }   
            }else{
                position++;  
                }
        } 
        return found;
    }

    @Override
    public void output() {
        System.out.print("Lista: ");
        for(int i=0; i<count;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    //me da el numero de elementos en la lista
    public int getCount() {
        return count;
    }
    
}
