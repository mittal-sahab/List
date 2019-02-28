import java.util.*;
public class ArrayList<D> implements List<D>
{
    Integer size;
    Integer buffer;
    Object arr[];
    public void add(D i){
        arr[size] = i;
        size++;
        if(size==buffer){
            Object arr2[] = new Object[buffer*2];
            buffer*=2;
            for(Integer j=0;j<size;j++){
                arr2[j] = arr[j];
            }
            arr = arr2;
        
        }
    }
    public void add(Object obj, Integer pos){
        Integer i;
        BoundsException ob = new BoundsException();
        try{
        if(pos>size){
            Object arr2[] = new Object[buffer*2];
            buffer*=2;
            for(Integer j=0;j<size;j++){
                arr2[j] = arr[j];
            }
            arr = arr2;
            throw ob;
        }
        
    }
    catch(BoundsException x){
        x.printer();
        return;
    }
        for(i=size;i>=pos;i--){
            arr[i+1] = arr[i];
            
        }
        arr[pos] = obj;
        size++;
        
        
        
    }
    public void traverse(){
        Integer i;
        for(i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public void remove (D ob){
        Integer i,j;
        for(i=0;i<size;i++){
            if(arr[i]==ob){
                break;
            }
        }
        for(j=i;j<size;j++){
            arr[j] = arr[j+1];
        }
        size--;
    }
    public int search(D ob){
        Integer i;
        for(i=0;i<size;i++){
            if(arr[i] == ob){
                
                break;
            }
        }
    return i;
    }
     public boolean isEmpty(){
        return size==0;
    }
    public D getElementAt(int pos){
        return (D)arr[pos];
    }
    public int size(){
        return size;
    }
    
    ArrayList(){
        size = 0;
        buffer = 10;
        arr = new Integer[buffer];
    }
}
