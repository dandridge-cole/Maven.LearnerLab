package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void getInstance() {
        Integer expected = 4;
        Integer actual = Instructors.getInstance().count();
        Assert.assertEquals(expected,actual);
    }

}