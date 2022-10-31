package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    int size = 0;
    @Override
    public boolean add(T item) {
        //TODO Auto-generated method stub

        //Find first null
        Object[] newItemsList;
        size++;
        //This if statement is what resizes once array is full
        if(items.length == size-1){
            //Resize array
            newItemsList = new Object[size+10];
            //copy items in new array
            for(int i = 0;i<items.length;i++){
                newItemsList[i] = items[i];
            }
            //add item to next element after null
            newItemsList[size-1] = item;

            //items is now new list
            items = newItemsList;

            return true;
        }
        items[size-1] = item;

        return true;
    }

    @Override
    public int getSize() {
        //TODO Auto-generated method stub
        //Always return the size of array when value is not null
        return size;
    }

    @Override
    public T get(int index) {
        //TODO Auto-generated method stub
        //Return null if value doesn't exists
        return ((T) items[index]!=null)?(T) items[index]:null;
    }
}
