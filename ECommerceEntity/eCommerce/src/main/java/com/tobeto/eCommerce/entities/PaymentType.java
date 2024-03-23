package com.tobeto.eCommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="payment_types")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentType {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="payment_type")
    private String paymentType;

    //---------------FK--------------------

    @OneToMany(mappedBy = "paymentType")
    private List<Payment> payments;

}
