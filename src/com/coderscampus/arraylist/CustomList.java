package com.coderscampus.arraylist;

public interface CustomList<T> {

    /**
     * This method shoukld add a new item in to the <code>CustomeList</code> and should
     * return <code>true</code> if it was successfully able to insert an item.
     * @param item the item to be added ot the <code>CustomList</code>
     * @return <code>ture</code> if item was successfully added, <code>false</code>
     */
    boolean add(T item);
    /**
     * This method shuld return the size of the <code> CustomList</code>
     * based on the number of actual elements stored inside of the <code>CustomList</code>
     * @return an <code>int</code> represnting the number of elments sotred in the <code>Custome</code>
     */
    int getSize();

    /**
     * this method will return the actual lement from the <code>CustomList</code> based on the
     * index that is passed in.
     * @param index represents the position in the backing <code>Object</code> array that we want
     * @return The element that is stored inside of the <code>CustomList</code> at the given index
     */
    T get(int index);
}
