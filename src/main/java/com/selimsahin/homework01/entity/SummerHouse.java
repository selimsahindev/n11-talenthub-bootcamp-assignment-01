package com.selimsahin.homework01.entity;

import com.selimsahin.homework01.enums.RealEstateType;

/*
 *  @Author: selimsahindev
 */
public class SummerHouse extends RealEstate {
    public SummerHouse() {
        super();
    }

    public SummerHouse (String address, double price, int numberOfRooms, int numberOfLivingRooms, double area) {
        super(address, price, numberOfRooms, numberOfLivingRooms, area);
    }

    @Override
    public RealEstateType getRealEstateType() {
        return RealEstateType.SUMMER_HOUSE;
    }
}
