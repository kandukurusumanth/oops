package CustomArray;

import java.util.Arrays;

public class CustomArrayList<T> {
    private T[] data;
    private int DEFAULT_SIZE=10;
    int size=0;
    @SuppressWarnings("")
    public CustomArrayList(){
        this.data = (T []) new Object[DEFAULT_SIZE];
    }
    public void Add(T num){
        if(isFull()){
            IncreaseSize();
        }
        data[size]=num;
        size++;
    
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void IncreaseSize(){
        T [] temp = (T[]) new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList [data=" + Arrays.toString(data) + ", DEFAULT_SIZE=" + DEFAULT_SIZE + ", size=" + size
                + "]";
    }


    

}

