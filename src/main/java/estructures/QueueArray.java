
package estructures;

public class QueueArray<T> implements Queue<T>{
    
    int front,rear,count,N;//posiciones
    T[] array;
    
    public QueueArray(int N){//hace un array de un tamaño dado por usuario
        front = 0;
        rear = 0;
        count = 0;
        this.N = N;
        array = (T[]) new Object[N];
    }
    
    
    public QueueArray(){
        this(4); //crea un queue de tamaño 4 por defecto
    }
    
    
    @Override
    public void enqueue(T item){
        if(full()){
            throw new RuntimeException("El Queue esta lleno");
        } else{
            array[rear] = item;
            rear = (rear+1)% N;
            count++;
        }
    
    }
    
    @Override
    public T dequeue(){
        T ret;
        if(empty()){
            throw new RuntimeException("El Queue esta Vacio");
        }else{
            ret = array[front];
            front = (front + 1) % N;
            count--;
        }
        return ret;
    }
    
    @Override
    public Boolean empty(){
        return count <= 0;
    }
    
    @Override
    public Boolean full(){
        return count >= N;
    }
    
    
    //me da el numero de elementos que tengo en el queve
    public int getCount() {
        return count;
    }
    
    public void print(){
        
        for(int i=0; i<count;i++){
            System.out.print(array[(i+front)%N]+" ");
        }
        System.out.println("");
        
    }

    
}
