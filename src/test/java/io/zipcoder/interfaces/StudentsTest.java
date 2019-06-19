package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstance() {
        Integer expected = 29;
        Integer actual = Students.getInstance().count();
        Assert.assertEquals(expected,actual);
    }
}