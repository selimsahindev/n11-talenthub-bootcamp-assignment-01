package com.selimsahin.homework01.entity;

import com.selimsahin.homework01.enums.RealEstateType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class RealEstate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", nullable = false, length = 100)
    private String address;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "number_of_rooms", nullable = false)
    private int numberOfRooms;

    @Column(name = "number_of_rooms", nullable = false)
    private int numberOfLivingRooms;

    @Column(name = "area", nullable = false)
    private double area;

    public abstract RealEstateType getRealEstateType();
}
