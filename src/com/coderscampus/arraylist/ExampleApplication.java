package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ExampleApplication {
    public static void main(String[] args){
        CustomList<String> myCustomList = new CustomArrayList<>();
        for(int i = 0;i<10000;i++ ){
            myCustomList.add("element " + (i+1));
        }
        System.out.println("This the maximum amount " + myCustomList.getSize());
        System.out.println("Get the value " + myCustomList.getSize());
        System.out.println("Get the value " + myCustomList.get(101));



        for (int i=0; i<myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i));
        }



    }
}
