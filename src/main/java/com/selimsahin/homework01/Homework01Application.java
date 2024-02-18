package com.selimsahin.homework01;

import com.selimsahin.homework01.entity.RealEstate;
import com.selimsahin.homework01.enums.RealEstateType;
import com.selimsahin.homework01.service.RealEstateService;
import com.selimsahin.homework01.service.RealEstateServiceImpl;
import com.selimsahin.homework01.util.LoadRealEstateData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework01Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework01Application.class, args);

		RealEstateService realEstateService = new RealEstateServiceImpl();


		System.out.println("┌───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐");
		System.out.println("│                                                  List of real estate properties in the system                                                 │");
		System.out.println("├──────────────────────────────────────────────────────────────┬─────────────────────┬─────────────┬────────────┬──────────────┬────────────────┤");
		System.out.println("│                            Address                           │       Type          │   Rooms     │  Living    │    Area      │     Price      │");
		System.out.println("├──────────────────────────────────────────────────────────────┼─────────────────────┼─────────────┼────────────┼──────────────┼────────────────┤");

		LoadRealEstateData.getRealEstates().forEach(realEstate -> {
			System.out.printf("│ %-60s │ %-19s │ %-11d │ %-10d │ %-12.2f │ %-14.2f │%n",
					realEstate.getAddress(),
					realEstate.getRealEstateType(),
					realEstate.getNumberOfRooms(),
					realEstate.getNumberOfLivingRooms(),
					realEstate.getArea(),
					realEstate.getPrice());
		});

		System.out.println("└──────────────────────────────────────────────────────────────┴─────────────────────┴─────────────┴────────────┴──────────────┴────────────────┘");

		// Print total real estate price
		System.out.printf("Total real estate price: %.2f%n", realEstateService.getTotalRealEstatePrice());

		// Print total real estate price by type
		System.out.printf("Total real estate price for HOUSE: %.2f%n", realEstateService.getTotalRealEstatePriceByType(RealEstateType.HOUSE));
		System.out.printf("Total real estate price for VILLA: %.2f%n", realEstateService.getTotalRealEstatePriceByType(RealEstateType.VILLA));
		System.out.printf("Total real estate price for SUMMER_HOUSE: %.2f%n\n", realEstateService.getTotalRealEstatePriceByType(RealEstateType.SUMMER_HOUSE));

		// Print average real estate area
		System.out.printf("Average real estate area: %.2f%n", realEstateService.getAverageRealEstateArea());

		// Print average real estate area by type
		System.out.printf("Average real estate area for HOUSE: %.2f%n", realEstateService.getAverageRealEstateAreaByType(RealEstateType.HOUSE));
		System.out.printf("Average real estate area for VILLA: %.2f%n", realEstateService.getAverageRealEstateAreaByType(RealEstateType.VILLA));
		System.out.printf("Average real estate area for SUMMER_HOUSE: %.2f%n\n", realEstateService.getAverageRealEstateAreaByType(RealEstateType.SUMMER_HOUSE));

		// Print total real estate price by room and living room
		int room = 3;
		int livingRoom = 2;
		RealEstateType realEstateType = RealEstateType.HOUSE; // Change this according to your data
		System.out.printf("Total real estate price for %d rooms and %d living rooms of type %s: %.2f%n",
				room, livingRoom, realEstateType,
				realEstateService.getRealEstateByRoomAndLivingRoom(room, livingRoom, realEstateType));
	}

}
