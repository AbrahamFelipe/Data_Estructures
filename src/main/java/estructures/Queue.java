/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package estructures;

/**
 *
 * @author ABRAHAM
 * @param <T>
 */
public interface Queue<T> {
    
    public void enqueue(T item);
    public T dequeue();
    public Boolean empty();
    public Boolean full();
}
