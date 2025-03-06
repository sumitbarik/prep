package com.study.prep.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "ADDRESS")
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "address_id")
    private Long addressId;
    @Column
    private String house;
    @Column
    private String lane;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String pin;

//    @OneToOne(mappedBy = "address")
//    private Employee employee;
}
