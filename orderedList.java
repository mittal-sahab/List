import java.util.Scanner;
public class orderedlist<D> implements List<D>{
    Integer size = 0;
    Integer buffer = 10;
    Object arr[];
    public void add(D o){
        Integer i,j;
        for(i=0;i<buffer;i++){
            if(arr[i]==null) break;
            else if((Integer)arr[i]>=(Integer)o) break;
            
        }
        for(j=size;j>i;j--){
            arr[j] = arr[j-1];
        }
        arr[i] = o;
        size++;
        if(size==buffer){
            Object arr2[] = new Object[buffer*2];
            buffer*=2;
            for(j=0;j<size;j++){
                arr2[j] = arr[j];
            }
            arr = arr2;
        }
        }
        
    public void traverse(){
        Integer i;
        for(i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
    public int search(D i){
        Integer lo = 0, hi = size,mid=0;
       while(lo<hi){
           mid = (lo+hi)/2;
           if((Integer)arr[mid]<(Integer)i) lo = mid;
           else if((Integer)arr[mid]>(Integer)i) hi = mid;
           else {
               
               break;
            }
       }
       return mid;
    }
    public void remove(D i){
          Integer lo = 0, hi = size,mid=0,j;
       while(lo<hi){
           mid = (lo+hi)/2;
           if((Integer)arr[mid]<(Integer)i) lo = mid;
           else if((Integer)arr[mid]>(Integer)i) hi = mid;
           else break;
       }
       for(j=mid;j<size;j++){
            arr[j] = arr[j+1];
        }
        size--;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public D getElementAt(int pos){
        BoundsException ob = new BoundsException();
        try{
            if(pos>size || pos<0) throw ob;
        }
        catch(BoundsException x){
            x.printer();
            return null;
        }
        return (D)arr[pos];
    }
    public int size(){
        return size;
    }
    orderedlist(){
        arr = new Object[buffer];
    }
    
    
}
