/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author CYBORG 15
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable{
    
    @Id
    @Column(name = "id",length = 10)
    private String id;
    
    @Column(name = "fname",length = 45,nullable = false)
    private String fname;
    
    @Column(name = "lname",length = 45,nullable = false)
    private String lname;
    
    @Column(name = "mobile",length = 10,nullable = false)
    private String mobile;
    
    @ManyToOne
    @JoinColumn(name = "age_status_id",nullable = false)
    private AgeStatus ageStatus;
    
    @ManyToOne
    @JoinColumn(name = "gender_id",nullable = false)
    private Gender gender;

    public Customer() {
    }

    public Customer(String id, String fname, String lname, String mobile, AgeStatus ageStatus, Gender gender) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.mobile = mobile;
        this.ageStatus = ageStatus;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMobile() {
        return mobile;
    }

    public AgeStatus getAgeStatus() {
        return ageStatus;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAgeStatus(AgeStatus ageStatus) {
        this.ageStatus = ageStatus;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
}
