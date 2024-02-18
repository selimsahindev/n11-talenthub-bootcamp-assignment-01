package com.selimsahin.homework01.entity;

import com.selimsahin.homework01.enums.RealEstateType;

public class SummerHouse extends RealEstate {
    @Override
    public RealEstateType getRealEstateType() {
        return RealEstateType.SUMMER_HOUSE;
    }
}
