/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

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
@Table(name = "invoice_item")
public class InvoiceItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "cus_want_category_id",nullable = false)
    private CustomerWantCategory cus_want_category_id;
    
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking_id;

    public InvoiceItem() {
    }

    public int getId() {
        return id;
    }

    public CustomerWantCategory getCus_want_category_id() {
        return cus_want_category_id;
    }

    public Booking getBooking_id() {
        return booking_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCus_want_category_id(CustomerWantCategory cus_want_category_id) {
        this.cus_want_category_id = cus_want_category_id;
    }

    public void setBooking_id(Booking booking_id) {
        this.booking_id = booking_id;
    }
}
