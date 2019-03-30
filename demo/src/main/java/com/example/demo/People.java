package com.example.demo;



import java.util.*;
import java.util.function.Consumer;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList = new ArrayList<>();


    public People (List<PersonType> personList) {
        this.personList = personList;
}

    public People(PersonType... personTypes){
        if (personList != null) {
            personList.addAll(Arrays.asList(personTypes));
        }
    }

    public void add(PersonType person){
        if (person != null){
            personList.add(person);
        }
    }

    public void remove(PersonType person){
        if (person!= null){
            personList.remove(person);
        }
    }

    public Integer size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void setPersonList(List<PersonType> personList) {
        this.personList = personList;
    }


    public List<PersonType> getPersonList() {
        return personList;
    }



    public PersonType findById(long id){
        for(PersonType person : personList){
            if(person.getId() == id){
                return person;
            }
        }
    return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super PersonType> action) {

    }

    @Override
    public Spliterator<PersonType> spliterator() {
        return null;
    }

}
