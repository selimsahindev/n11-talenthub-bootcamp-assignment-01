package com.selimsahin.homework01.util;

import com.selimsahin.homework01.entity.House;
import com.selimsahin.homework01.entity.RealEstate;
import com.selimsahin.homework01.entity.SummerHouse;
import com.selimsahin.homework01.entity.Villa;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/*
 *  @Author: selimsahindev
 */
@Getter
public class LoadRealEstateData {
    private static final List<RealEstate> realEstates = new ArrayList<>();

    static {
        loadRealEstateData();
    }

    private LoadRealEstateData() { }

    private static void loadRealEstateData() {
        realEstates.add(new House("Istanbul", 1_000_000, 4, 1, 200));
        realEstates.add(new House("Ankara", 500_000, 3, 1, 150));
        realEstates.add(new House("Izmir", 750_000, 5, 2, 250));
        realEstates.add(new House("Bursa", 300_000, 2, 1, 100));
        realEstates.add(new House("Antalya", 600_000, 4, 1, 180));
        realEstates.add(new Villa("Istanbul", 2_000_000, 6, 2, 300));
        realEstates.add(new Villa("Ankara", 1_000_000, 5, 2, 250));
        realEstates.add(new Villa("Izmir", 1_500_000, 7, 3, 350));
        realEstates.add(new Villa("Bursa", 800_000, 4, 2, 200));
        realEstates.add(new Villa("Antalya", 1_200_000, 6, 2, 280));
        realEstates.add(new SummerHouse("Istanbul", 1_500_000, 4, 1, 200));
        realEstates.add(new SummerHouse("Ankara", 750_000, 3, 1, 150));
        realEstates.add(new SummerHouse("Izmir", 1_000_000, 5, 2, 250));
        realEstates.add(new SummerHouse("Bursa", 500_000, 2, 1, 100));
        realEstates.add(new SummerHouse("Antalya", 900_000, 4, 1, 180));
    }
}
