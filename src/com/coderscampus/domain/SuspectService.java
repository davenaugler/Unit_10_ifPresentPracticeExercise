// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class SuspectService {

	private FileService fileService = new FileService();

	public void trackCarmenSandiego() throws FileNotFoundException, IOException {
		for (int week = 1; week <= 3; week++) {
			List<SuspectLocation> locations = fileService.readFromFile("InterpolWatchReport-Week" + week + ".csv");
			findCarmenSandiego(locations);
		}
	}

	public void findCarmenSandiego(List<SuspectLocation> locations) {
		Optional<SuspectLocation> carmenLocation = locations.stream()
				.filter(location -> location.getName().equals("CARMEN SANDIEGO")).findAny();
//		System.out.println("CARMENS LOCATION IS: " + carmenLocation);

		carmenLocation.ifPresentOrElse(
				location -> System.out.println("Carmen Sandiego is in..." + location.getCountry()),
				() -> System.out.println("Galdang, just missed her!"));
	}
}
