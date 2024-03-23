package com.tobeto.eCommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="invoices_details")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvoicesDetail {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="quantity")
    private int quantity;

    @Column(name="unit_price")
    private double  unitPrice;

    @Column(name="line_total")
    private double lineTotal;

    //---------------FK--------------------
    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "order_details_id")
    private OrderDetail orderDetail;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
