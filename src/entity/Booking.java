/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
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
@Table(name = "booking")
public class Booking implements Serializable{
    
    @Id
    @Column(name = "id",length = 10)
    private String id;
    
    @Column(name = "date",nullable = false)
    private LocalDate date;
    
    @Column(name = "start_time",nullable = false)
    private LocalTime start_time;
    
    @Column(name = "end_time")
    private LocalTime end_time;
    
    @ManyToOne
    @JoinColumn(name = "booking_status_id",nullable = false)
    private BookingStatus booking_status_id;
    
    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer_id;
    
    @ManyToOne
    @JoinColumn(name = "working_status_id",nullable = false)
    private WorkingStatus working_status_id;

    public Booking() {
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStart_time() {
        return start_time;
    }

    public LocalTime getEnd_time() {
        return end_time;
    }

    public BookingStatus getBooking_status_id() {
        return booking_status_id;
    }

    public Customer getCustomer_id() {
        return customer_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    public void setBooking_status_id(BookingStatus booking_status_id) {
        this.booking_status_id = booking_status_id;
    }

    public void setCustomer_id(Customer customer_id) {
        this.customer_id = customer_id;
    }

    public WorkingStatus getWorking_status_id() {
        return working_status_id;
    }

    public void setWorking_status_id(WorkingStatus working_status_id) {
        this.working_status_id = working_status_id;
    }
}
