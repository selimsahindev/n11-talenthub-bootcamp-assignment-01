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
public class LoadRealEstateData {
    @Getter
    private static final List<RealEstate> realEstates = new ArrayList<>();

    static {
        loadRealEstateData();
    }

    private LoadRealEstateData() { }

    private static void loadRealEstateData() {
        realEstates.add(new House("321 Beach Rd, Copenhagen", 150000.00, 2, 1, 100.25));
        realEstates.add(new House("123 Main St, Paris", 200000.00, 3, 2, 150.50));
        realEstates.add(new House("456 Elm St, Berlin", 250000.00, 4, 3, 200.75));
        realEstates.add(new House("789 Oak St, Madrid", 300000.00, 5, 4, 250.00));
        realEstates.add(new House("1011 Pine St, Rome", 350000.00, 6, 5, 300.25));

        realEstates.add(new Villa("111 Beach Rd, Copenhagen", 160000.00, 3, 2, 120.25));
        realEstates.add(new Villa("234 Main St, Paris", 210000.00, 4, 3, 170.50));
        realEstates.add(new Villa("567 Elm St, Berlin", 260000.00, 5, 4, 220.75));
        realEstates.add(new Villa("890 Oak St, Madrid", 310000.00, 6, 5, 270.00));
        realEstates.add(new Villa("1112 Pine St, Rome", 360000.00, 7, 6, 320.25));

        realEstates.add(new SummerHouse("111 Beach Rd, Copenhagen", 155000.00, 2, 1, 105.25));
        realEstates.add(new SummerHouse("234 Main St, Paris", 205000.00, 3, 2, 155.50));
        realEstates.add(new SummerHouse("567 Elm St, Berlin", 255000.00, 4, 3, 205.75));
        realEstates.add(new SummerHouse("890 Oak St, Madrid", 305000.00, 5, 4, 255.00));
        realEstates.add(new SummerHouse("1112 Pine St, Rome", 355000.00, 6, 5, 305.25));

    }
}
