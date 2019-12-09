package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public People(List<PersonType> personList) {
        this.personList = personList;
    }
    public void add(PersonType person){

    }
    public void remove(PersonType person){

    }
    public Integer size(){
        return this.personList.size();
    }
    public void clear(){
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> people) {
        people.forEach(personList :: add);
    }
    public PersonType findById(Long id) {
        for (PersonType i : personList) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }
    public List<PersonType> findAll(){
        return personList;
    }


}
