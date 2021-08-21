package com.test;

import com.main.AddressBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ContactTest {
    @Test
    void whenANewContactIsAdded_IntoTheContactList_ShouldPassTheTest(){
        AddressBook addressBook = new AddressBook();
        List<AddressBook> myList = addressBook.addNewContact();
        Assertions.assertEquals("Shubham",myList);
    }
}
