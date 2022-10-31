package com.coderscampus.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    void should_add_one_item_to_list(){

        //Arrange
        CustomList<Integer> customList = new CustomArrayList<>();

        //Act
        customList.add(10);


        //Assert
        //what would we expect to happen?
        //I expect there to be an Integer with value 10 sorted in the first
        //index in my customelist


        assertEquals(customList.get(0),10);
        assertEquals(customList.getSize(),1);
        //fail("Not yet implemented");
    }

}