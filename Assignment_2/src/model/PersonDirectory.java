/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

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
    
//    public Person addPerson() {
//        Person p = new Person();
//        persons.add(p);
//        return p;
//    }
    
    public Person addPerson(String firstName, String lastName, String ssn, byte age, double shoesnum, 
                            Address homeaddr, Address workaddr) {
        Person p = new Person(firstName, lastName, ssn, age, shoesnum, homeaddr, workaddr);
        persons.add(p);
        return p;
    }
    
    
    public void deletePerson(Person person) {
        persons.remove(person);
    }
    
    public List<Person> searchPerson(String information) {
        List<Person> foundPersons = new ArrayList<>();
        for (Person p : persons) {
            if (p.getFirstName().contains(information) || p.getLastName().contains(information) ||  p.getHomeaddr().getStreetaddr().contains(information) ||
                p.getWorkaddr().getStreetaddr().contains(information)) {
                foundPersons.add(p);
            }
        }
        return foundPersons;
    }
    
}
