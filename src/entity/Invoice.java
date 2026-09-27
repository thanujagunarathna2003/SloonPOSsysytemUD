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
@Table(name = "invoice")
public class Invoice {
    
    @Id
    @Column(name = "id",length = 10)
    private String id;
    
    @Column(name = "price",nullable = false)
    private double price;
    
    @ManyToOne
    @JoinColumn(name = "invoice_item_id",nullable = false)
    private InvoiceItem invoice_item_id;

    public Invoice() {
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public InvoiceItem getInvoice_item_id() {
        return invoice_item_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInvoice_item_id(InvoiceItem invoice_item_id) {
        this.invoice_item_id = invoice_item_id;
    }
}
