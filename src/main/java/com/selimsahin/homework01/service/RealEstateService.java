package com.selimsahin.homework01.service;

import com.selimsahin.homework01.enums.RealEstateType;

/*
 *  @Author: selimsahindev
 */
public interface RealEstateService {
    double getTotalRealEstatePriceByType(RealEstateType realEstateType);

    double getTotalRealEstatePrice();

    double getAverageRealEstateAreaByType(RealEstateType realEstateType);

    double getAverageRealEstateArea();

    double getRealEstateByRoomAndLivingRoom(int room, int livingRoom, RealEstateType realEstateType);
}
