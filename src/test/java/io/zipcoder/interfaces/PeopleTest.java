package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void add() {
        Student stu1 = new Student(123L,"BobbieJon1");
        Instructor instr1 = new Instructor(567L, "Professor Moriarty");
        People ppl = new People();
        ppl.add(stu1);
        ppl.add(instr1);
        Integer expected=2;
        Integer actual=ppl.count();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findById() {
        Long profID = 567L;
        Student stu1 = new Student(123L,"BobbieJon1");
        Instructor expected = new Instructor(profID, "Professor Moriarty");
        People ppl = new People();
        ppl.add(stu1);
        ppl.add(expected);
        Person actual=ppl.findById(profID);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        Long profID = 567L;
        Student stu1 = new Student(123L,"BobbieJon1");
        Instructor unexpected = new Instructor(profID, "Professor Moriarty");
        People ppl = new People();
        ppl.add(stu1);
        ppl.add(unexpected);
        Integer expected1 = 2;
        Integer actual1=ppl.count();
        Assert.assertEquals(expected1,actual1);
        ppl.remove(unexpected);
        Assert.assertNull(ppl.findById(profID));
        Integer expected2 = 1;
        Integer actual2=ppl.count();
        Assert.assertEquals(expected2,actual2);

    }
}