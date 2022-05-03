/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package estructures;

/**
 *
 * @author ABRAHAM
 */
public interface List {
    
    public Boolean empty();
    public Boolean full();
    public Boolean delete(int item);
    public Boolean insert(int item);
    public Boolean search(int item);
    public void output();
    
    
}
