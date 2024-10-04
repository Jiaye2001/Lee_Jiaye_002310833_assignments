/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jiaye
 */
public class PersonDirectory {
    
    private ArrayList<Person> persons;
    
    public PersonDirectory() {
        this.persons = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPerson() {
        return persons;
    }
    
    public void setPerson(ArrayList<Person> person) {
        this.persons = person;
    }
    
    public Person addPerson() {
        Person p = new Person();
        persons.add(p);
        return p;
    }
    
    public void deletePerson(Person person) {
        persons.remove(person);
    }
    
    public Person searchPerson(String information) {
        for (Person p : persons) {
            if (p.getFirstName().contains(information) || p.getLastName().contains(information) || p.getH_streetaddr().contains(information) || p.getW_streetaddr().contains(information)) {
                return p;
            }
        }
        return null;
    }
    
}
