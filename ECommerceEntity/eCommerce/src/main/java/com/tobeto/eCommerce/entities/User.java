package com.tobeto.eCommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Table(name="users")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="user_name")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="fullname")
    private String  fullName;

    @Column(name="email")
    private String email;


    @Column(name="gender")
    private String  gender;

    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name="creation_date")
    private LocalDate creationDate;

    @Column(name="phone_number")
    private String  phoneNumber;

    //---------------FK--------------------
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Address> addresses;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Order> orders;






}
