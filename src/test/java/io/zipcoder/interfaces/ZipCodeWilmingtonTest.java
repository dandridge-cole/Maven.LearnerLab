package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        zcw.hostLecture(1010L,43.5);
        Map<Student,Double> map = zcw.getStudyMap();
        Random rand = new Random();
        Long l = (long)(rand.nextInt(29)+1);
        Double expected = 1.5;
        Double actual = map.get(l);
    }
}