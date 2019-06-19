package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void add() {
        Instructor stu1 = new Instructor(123L,"BobbieJon1");
        Instructor instr1 = new Instructor(567L, "Professor Moriarty");
        People<Instructor> ppl = Instructors.getInstance();
        ppl.add(stu1);
        ppl.add(instr1);
        Integer expected=7;
        Integer actual=ppl.count();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findById() {
        Long profID = 567L;
        Student stu1 = new Student(123L,"BobbieJon1");
        Student expected = new Student(profID, "Professor Moriarty");
        People<Student> ppl = Students.getInstance();
        ppl.add(stu1);
        ppl.add(expected);
        Person actual=ppl.findById(profID);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        Long profID = 567L;
        Instructor stu1 = new Instructor(123L,"BobbieJon1");
        Instructor unexpected = new Instructor(profID, "Professor Moriarty");
        People<Instructor> ppl = Instructors.getInstance();
        ppl.add(stu1);
        ppl.add(unexpected);
        Integer expected1 = 6;
        Integer actual1=ppl.count();
        Assert.assertEquals(expected1,actual1);
        ppl.remove(unexpected);
        Assert.assertNull(ppl.findById(profID));
        Integer expected2 = 5;
        Integer actual2=ppl.count();
        Assert.assertEquals(expected2,actual2);

    }
}