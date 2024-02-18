package com.selimsahin.homework01.entity;

import com.selimsahin.homework01.enums.RealEstateType;

/*
 *  @Author: selimsahindev
 */
public class House extends RealEstate {
    public House() {
        super();
    }

    public House (String address, double price, int numberOfRooms, int numberOfLivingRooms, double area) {
        super(address, price, numberOfRooms, numberOfLivingRooms, area);
    }

    @Override
    public RealEstateType getRealEstateType() {
        return RealEstateType.HOUSE;
    }
}
