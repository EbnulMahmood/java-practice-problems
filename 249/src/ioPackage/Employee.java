/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioPackage;

import java.io.Serializable;

/**
 *
 * @author Rubaba Hasan
 */
class Employee implements Serializable{
    String name;
    transient String address;
    int SSN;
    int number;

    public Employee() {
    }

    public Employee(String name, String address, int SSN, int number) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }
    
}
