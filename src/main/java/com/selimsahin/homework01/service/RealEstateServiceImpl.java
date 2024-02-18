package com.selimsahin.homework01.service;

import com.selimsahin.homework01.entity.RealEstate;
import com.selimsahin.homework01.enums.RealEstateType;
import com.selimsahin.homework01.util.LoadRealEstateData;

import java.util.List;

/*
 *  @Author: selimsahindev
 */
public class RealEstateServiceImpl implements RealEstateService {
    private final List<RealEstate> realEstateList;

    public RealEstateServiceImpl() {
        this.realEstateList = LoadRealEstateData.getRealEstates();
    }

    @Override
    public double getTotalRealEstatePriceByType(RealEstateType realEstateType) {
        return realEstateList.stream()
                .filter(realEstate -> realEstate.getRealEstateType().equals(realEstateType))
                .mapToDouble(RealEstate::getPrice)
                .sum();
    }

    @Override
    public double getTotalRealEstatePrice() {
        return realEstateList.stream()
                .mapToDouble(RealEstate::getPrice)
                .sum();
    }

    @Override
    public double getAverageRealEstateAreaByType(RealEstateType realEstateType) {
        return realEstateList.stream()
                .filter(realEstate -> realEstate.getRealEstateType().equals(realEstateType))
                .mapToDouble(RealEstate::getArea)
                .average()
                .orElse(0);
    }

    @Override
    public double getAverageRealEstateArea() {
        return realEstateList.stream()
                .mapToDouble(RealEstate::getArea)
                .average()
                .orElse(0);
    }

    @Override
    public double getRealEstateByRoomAndLivingRoom(int room, int livingRoom, RealEstateType realEstateType) {
        return realEstateList.stream()
                .filter(realEstate -> realEstate.getRealEstateType().equals(realEstateType))
                .filter(realEstate -> realEstate.getNumberOfRooms() == room)
                .filter(realEstate -> realEstate.getNumberOfLivingRooms() == livingRoom)
                .mapToDouble(RealEstate::getPrice)
                .sum();
    }
}
