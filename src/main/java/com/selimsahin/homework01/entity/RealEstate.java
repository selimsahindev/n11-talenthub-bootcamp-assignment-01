package com.selimsahin.homework01.entity;

import com.selimsahin.homework01.enums.RealEstateType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/*
 *  @Author: selimsahindev
 */
@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
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

    protected RealEstate() {
        this.address = "";
        this.price = 0;
        this.numberOfRooms = 0;
        this.numberOfLivingRooms = 0;
        this.area = 0;
    }

    protected RealEstate(String address, double price, int numberOfRooms, int numberOfLivingRooms, double area) {
        this.address = address;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
        this.area = area;
    }

    public abstract RealEstateType getRealEstateType();
}
