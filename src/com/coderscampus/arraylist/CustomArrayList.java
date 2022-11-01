package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    int size = 0;
    @Override
    public boolean add(T item) {
        //TODO Auto-generated method stub

        //This if statement is what resizes once array is full
        if(size == items.length){
            items = Arrays.copyOf(items,size*2);
            //items is now new list
            size++;
            return true;
        }
        items[size] = item;
        size++;
        return true;
    }

    @Override
    public int getSize() {
        //TODO Auto-generated method stub
        return size;
    }

    @Override
    public T get(int index) {
        //TODO Auto-generated method stub
        //Return null if value doesn't exists
        return ((T) items[index]!=null)?(T) items[index]:null;
    }
}
