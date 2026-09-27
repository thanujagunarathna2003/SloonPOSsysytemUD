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
@Table(name = "booking_status")
public class BookingStatus implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "booking_st")
    private String booking_st;

    public BookingStatus() {
    }

    public int getId() {
        return id;
    }

    public String getBooking_st() {
        return booking_st;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBooking_st(String booking_st) {
        this.booking_st = booking_st;
    }
}
