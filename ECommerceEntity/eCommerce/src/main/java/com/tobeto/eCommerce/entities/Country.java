package com.tobeto.eCommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="country")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="country_name")
    private String countryName;

    //---------------FK--------------------
    @OneToMany(mappedBy = "country")
    private List<Address> addresses;

    @OneToMany(mappedBy = "country")
    private List<City> cities;

}
