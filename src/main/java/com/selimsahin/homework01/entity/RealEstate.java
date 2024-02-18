package com.selimsahin.homework01.entity;

import com.selimsahin.homework01.enums.RealEstateType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*
 *  @Author: selimsahindev
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class RealEstate {
    protected Long id;
    protected String address;
    protected double price;
    protected int numberOfRooms;
    protected int numberOfLivingRooms;
    protected double area;

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
