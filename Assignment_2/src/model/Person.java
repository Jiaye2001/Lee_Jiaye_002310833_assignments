/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jiaye
 */
public class Person {
    
     // create 17 attributes
   
    private String firstName;
    private String lastName;
    private String ssn;
    private byte age;
    private double shoesnum;
    

    private Address homeaddr;
    private Address workaddr;
    
//    private String h_streetaddr;
//    private int h_unitnum;
//    private String h_city;
//    private String h_state;
//    private String h_zipcode;
//    private long h_phonenum;
//       
//    private String w_streetaddr;
//    private int w_unitnum;
//    private String w_city;
//    private String w_state;
//    private String w_zipcode;
//    private long w_phonenum;
    
    
    public Person() {
        this.homeaddr = new Address();
        this.workaddr = new Address();
    }
    
    public Person(String firstName, String lastName, String ssn, byte age, double shoesnum, Address homeaddr, Address workaddr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.age = age;
        this.shoesnum = shoesnum;
        this.homeaddr = homeaddr;
        this.workaddr = workaddr;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
    
    public double getShoesnum() {
        return shoesnum;
    }

    public void setShoesnum(double shoesnum) {
        this.shoesnum = shoesnum;
    }
    
    public Address getHomeaddr() {
        return homeaddr;
    }

    public void setHomeaddr(Address homeaddr) {
        this.homeaddr = homeaddr;
    }

    public Address getWorkaddr() {
        return workaddr;
    }

    public void setWorkaddr(Address workaddr) {
        this.workaddr = workaddr;
    }

//    public String getH_streetaddr() {
//        return h_streetaddr;
//    }
//
//    public void setH_streetaddr(String h_streetaddr) {
//        this.h_streetaddr = h_streetaddr;
//    }
//
//    public int getH_unitnum() {
//        return h_unitnum;
//    }
//
//    public void setH_unitnum(int h_unitnum) {
//        this.h_unitnum = h_unitnum;
//    }
//
//    public String getH_city() {
//        return h_city;
//    }
//
//    public void setH_city(String h_city) {
//        this.h_city = h_city;
//    }
//
//    public String getH_state() {
//        return h_state;
//    }
//
//    public void setH_state(String h_state) {
//        this.h_state = h_state;
//    }
//
//    public String getH_zipcode() {
//        return h_zipcode;
//    }
//
//    public void setH_zipcode(String h_zipcode) {
//        this.h_zipcode = h_zipcode;
//    }
//
//    public long getH_phonenum() {
//        return h_phonenum;
//    }
//
//    public void setH_phonenum(long h_phonenum) {
//        this.h_phonenum = h_phonenum;
//    }
//
//    public String getW_streetaddr() {
//        return w_streetaddr;
//    }
//
//    public void setW_streetaddr(String w_streetaddr) {
//        this.w_streetaddr = w_streetaddr;
//    }
//
//    public int getW_unitnum() {
//        return w_unitnum;
//    }
//
//    public void setW_unitnum(int w_unitnum) {
//        this.w_unitnum = w_unitnum;
//    }
//
//    public String getW_city() {
//        return w_city;
//    }
//
//    public void setW_city(String w_city) {
//        this.w_city = w_city;
//    }
//
//    public String getW_state() {
//        return w_state;
//    }
//
//    public void setW_state(String w_state) {
//        this.w_state = w_state;
//    }
//
//    public String getW_zipcode() {
//        return w_zipcode;
//    }
//
//    public void setW_zipcode(String w_zipcode) {
//        this.w_zipcode = w_zipcode;
//    }
//
//    public long getW_phonenum() {
//        return w_phonenum;
//    }
//
//    public void setW_phonenum(long w_phonenum) {
//        this.w_phonenum = w_phonenum;
//    }       
    @Override
    public String toString() {
        return getFirstName();
    }
}
