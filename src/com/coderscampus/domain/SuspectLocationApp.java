// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SuspectLocationApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SuspectService suspectService = new SuspectService();
		suspectService.trackCarmenSandiego();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<String> csvFiles = new ArrayList<>();
//		csvFiles.add("InterpolWatchReport-Week1.csv");
//		csvFiles.add("InterpolWatchReport-Week2.csv");
//		csvFiles.add("InterpolWatchReport-Week3.csv");
//		System.out.println(csvFiles);

//		FileService fileService = new FileService();
//		SuspectService suspectService = new SuspectService();

//		SuspectService suspectService = new SuspectService();
//		for (int week = 1; week <= 3; week++) {
//			List<SuspectLocation> locations = fileService.readFromFile("InterpolWatchReport-Week" + week + ".csv");
//			suspectService.findCarmenSandiego(locations);
//		}

//		List<SuspectLocation> suspectsLocations = suspectService.readThreeFiles(csvFiles);
//		suspectService.findCarmenSandiego(suspectsLocations);

	}

}
