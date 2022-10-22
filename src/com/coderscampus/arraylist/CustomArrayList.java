package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];

    @Override
    public boolean add(T item) {
        //TODO Auto-generated method stub
        int size = getSize();
        //Find first null
        Object[] newItemsList;

        //This if statement is what resizes once array is full
        if(items.length == getSize()){
            //Resize array
            newItemsList = new Object[getSize()+10];
            //copy items in new array
            for(int i = 0;i<items.length;i++){
                newItemsList[i] = items[i];
            }
            //add item to next element after null
            newItemsList[getSize()] = item;

            //items is now new list
            items = newItemsList;
            return true;
        }
        items[size] = item;
        return true;
    }

    @Override
    public int getSize() {
        //TODO Auto-generated method stub
        //Always return the size of array when value is not null
        int index = 0;

        for(Object it :items){
            if(it == null){
                return index;
            } else {
                index = index + 1;
            }
        }
        return index;
    }

    @Override
    public T get(int index) {
        //TODO Auto-generated method stub
        //Return null if value doesn't exists
        return ((T) items[index]!=null)?(T) items[index]:null;
    }
}
