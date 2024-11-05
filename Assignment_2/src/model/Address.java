/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jiaye
 */
public class Address {

    private String streetaddr;
    private int unitnum;
    private String city;
    private String state;
    private String zipcode;
    private long phonenum;
    
    public Address() {
        streetaddr = "";
        unitnum = 0;
        city = "";
        state = "";
        zipcode = "";
        phonenum = 0;        
        
    }
     
    public Address(String streetaddr, int unitnum, String city, String state, String zipcode,long phonenum) {
        this.streetaddr = streetaddr;
        this.unitnum = unitnum;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phonenum = phonenum;
    }
    
    public String getStreetaddr() {
        return streetaddr;
    }

    public void setStreetaddr(String streetaddr) {
        this.streetaddr = streetaddr;
    }

    public int getUnitnum() {
        return unitnum;
    }

    public void setUnitnum(int unitnum) {
        this.unitnum = unitnum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }
    

    
}
