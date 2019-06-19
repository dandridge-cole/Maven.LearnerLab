package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class People<E extends Person> implements Iterable{

    private List<E> personList;

    public List<E> getPersonList() {
        return personList;
    }

    public People(List<E> personList) {
        this.personList = personList;
    }

    public People() {
        this.personList = new LinkedList<>();
    }

    public void add(E person){
        personList.add(person);
    }

    public E findById(Long id){
        for(E person:this.personList) if(person.getId()==id)return person;
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

    public abstract E[] toArray();

    public Iterator iterator(){
        return personList.iterator();
    }
}
