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
@Table(name = "age_status")
public class AgeStatus implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "ages_status",length = 45,nullable = false)
    private String ages_status;

    public AgeStatus() {
    }

    public AgeStatus(String ages_status) {
        this.ages_status = ages_status;
    }

    public int getId() {
        return id;
    }

    public String getAges_status() {
        return ages_status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAges_status(String ages_status) {
        this.ages_status = ages_status;
    }
    
    @Override
    public String toString(){
        return ages_status;
    }
    
}
