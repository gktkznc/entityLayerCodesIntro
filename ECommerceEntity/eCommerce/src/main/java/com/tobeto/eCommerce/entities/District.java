package com.tobeto.eCommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Table(name="district")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class District {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="district_name")
    private String districtName;

    //---------------FK--------------------
    @OneToMany(mappedBy = "district")
    private List<Address> addresses;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
