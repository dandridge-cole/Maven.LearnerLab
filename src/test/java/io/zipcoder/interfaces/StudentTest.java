package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learnTest() {
        Student stu1 = new Student(123L,"BobbieJon");
        Double expected = 5.5;
        stu1.learn(expected);
        Double actual = stu1.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testImplementation() {
        Student stu1 = new Student(123L,"BobbieJon");
        Assert.assertTrue(stu1 instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student stu1 = new Student(123L,"BobbieJon");
        Assert.assertTrue(stu1 instanceof Person);
    }

    @Test
    public void getTotalStudyTimeTest() {
    }
}