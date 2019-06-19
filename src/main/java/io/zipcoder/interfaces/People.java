package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class People implements Iterable{
    private List<Person> personList;

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public People() {
        this.personList = new LinkedList<>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(Long id){
        for(Person person:this.personList) if(person.getId()==id)return person;
        return null;
    }

    public Boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(Long id){
        Person temp = findById(id);
        this.remove(temp);
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    public Iterator iterator(){
        return personList.iterator();
    }
}
