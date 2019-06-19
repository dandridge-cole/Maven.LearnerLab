package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void ConstructorTest() {
        Long expectedId=12345L;
        String expectedName="Jimothy";
        Person p1 = new Person(expectedId,expectedName);
        Long actualId = p1.getId();
        String actualName = p1.getName();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedId,actualId);
    }

    @Test
    public void setNameTest() {
        Long id=12345L;
        String unexpectedName="Jimothy";
        String expectedName = "JammyJim";
        Person p1 = new Person(id,unexpectedName);
        p1.setName(expectedName);
        String actualName = p1.getName();
        Assert.assertEquals(expectedName,actualName);
    }

}