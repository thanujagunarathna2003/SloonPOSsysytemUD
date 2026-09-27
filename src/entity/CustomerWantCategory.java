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
@Table(name = "cus_want_category")
public class CustomerWantCategory implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "works",length = 100,nullable = false)
    private String works;
    
    @ManyToOne
    @JoinColumn(name = "massage_id",nullable = false)
    private Massage massage;

    public CustomerWantCategory() {
    }

    public int getId() {
        return id;
    }

    public String getWorks() {
        return works;
    }

    public Massage getMassage() {
        return massage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWorks(String works) {
        this.works = works;
    }

    public void setMassage(Massage massage_id) {
        this.massage = massage_id;
    }
}
