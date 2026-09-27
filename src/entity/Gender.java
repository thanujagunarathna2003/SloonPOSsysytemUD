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
import javax.persistence.Table;

/**
 *
 * @author CYBORG 15
 */
@Entity
@Table(name = "gender")
public class Gender implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "gender_name", length = 45, nullable = false)
    private String gender_name;

    public Gender() {
    }

    public Gender(String gender_name) {
        this.gender_name = gender_name;
    }

    public int getId() {
        return id;
    }

    public String getGender_name() {
        return gender_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender_name(String gender_name) {
        this.gender_name = gender_name;
    }

    @Override
    public String toString() {
        return gender_name;
    }
}
