package com.selimsahin.homework01.entity;

import com.selimsahin.homework01.enums.RealEstateType;

public class House extends RealEstate {
    @Override
    public RealEstateType getRealEstateType() {
        return RealEstateType.HOUSE;
    }
}
