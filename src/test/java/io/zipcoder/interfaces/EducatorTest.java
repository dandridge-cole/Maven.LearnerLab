package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    @Test
    public void testImplementation() {
        Assert.assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(Educator.KRIS.getInstructor() instanceof Person);
    }

    @Test
    public void teach() {
        Student stu1 = new Student(123L,"BobbieJon");
        Double expected = 5.5;
        Educator.DOLIO.teach(stu1,expected);
        Double actual = stu1.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lecture() {
        Student stu1 = new Student(123L,"BobbieJon1");
        Student stu2 = new Student(124L,"BobbieJon2");
        Student stu3 = new Student(125L,"BobbieJon3");
        Learner[] students = new Student[]{stu1,stu2,stu3};
        Double expected = 1.5;
        Educator.FROILAN.lecture(students,expected*3);
        Double actual = stu1.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
        actual = stu2.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
        actual = stu3.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }
}