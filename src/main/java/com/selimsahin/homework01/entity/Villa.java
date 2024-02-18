package com.selimsahin.homework01.entity;

import com.selimsahin.homework01.enums.RealEstateType;

/*
 *  @Author: selimsahindev
 */
public class Villa extends RealEstate {
    public Villa() {
        super();
    }

    public Villa (String address, double price, int numberOfRooms, int numberOfLivingRooms, double area) {
        super(address, price, numberOfRooms, numberOfLivingRooms, area);
    }

    @Override
    public RealEstateType getRealEstateType() {
        return RealEstateType.VILLA;
    }
}
