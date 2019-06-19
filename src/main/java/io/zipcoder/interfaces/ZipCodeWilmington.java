package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static ZipCodeWilmington ourInstance = new ZipCodeWilmington();
    private static Students students = Students.getInstance();
    private static Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return ourInstance;
    }

    private ZipCodeWilmington() {

    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[])students.toArray(),numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours){
        Instructor teacher = (Instructor)instructors.findById(id);
        Student[] stus = getStudents();
        teacher.lecture(stus,numberOfHours);
    }

    private Student[] getStudents() {
        Student[] stus = new Student[students.count()];
        Person[] pers = students.toArray();
        for (int i = 0; i < students.count(); i++) {
            stus[i]=(Student)pers[i];
        }
        return stus;
    }

    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> thisMap = new HashMap<>();
        Student[] stus = getStudents();
        for(Student stu:stus){
            thisMap.put(stu,stu.getTotalStudyTime());
        }
        return thisMap;
    }
}
