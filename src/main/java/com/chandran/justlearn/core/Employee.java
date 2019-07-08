package com.chandran.justlearn.core;

import java.util.Date;

/*
 *  Date : 07/04/2019.
 */


public class Employee implements Cloneable {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Long id;
    private String name;
    private Date dob;       //Mutable field

    public Employee(Long id, String name, Date dob) {
        super();
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    //Getters and setters

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee clone = null;
        try
        {
            clone = (Employee) super.clone();

            //Copy new date object to cloned method
            clone.setDob((Date) this.getDob().clone());
        }
        catch (CloneNotSupportedException e)
        {
            throw new RuntimeException(e);
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDob() {
        return this.dob;
    }



}