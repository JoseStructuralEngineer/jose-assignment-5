package com.coderscampus.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    void should_add_one_item_to_list(){

        //Arrange
        CustomList<Integer> customList = new CustomArrayList<>();
        for(int i = 0;i<10000;i++ ){
            customList.add(i+1);
        }
        //Act



        //Assert
        //what would we expect to happen?
        //I expect there to be an Integer with value 10 sorted in the first
        //index in my customelist

        for(int i = 0;i<10000;i++ ){
            assertEquals(customList.get(0+i),i+1);
        }

        assertEquals(customList.getSize(),10000);
        //fail("Not yet implemented");
    }

}