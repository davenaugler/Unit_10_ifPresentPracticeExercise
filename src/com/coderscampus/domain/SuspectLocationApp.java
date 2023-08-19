// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SuspectLocationApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<String> csvFiles = new ArrayList<>();
		csvFiles.add("InterpolWatchReport-Week1.csv");
		csvFiles.add("InterpolWatchReport-Week2.csv");
		csvFiles.add("InterpolWatchReport-Week3.csv");
		
		SuspectService suspectService = new SuspectService();
		
		List<SuspectLocation> suspectsLocation = suspectService.readThreeFiles(csvFiles);
//		System.out.println(suspectsLocation);
		
//		FileService fileService = new FileService();
//		String filePath = "InterpolWatchReport-Week1.csv";
//		
//		List<String> fileContent = fileService.readFile(filePath);
		
//		System.out.println("File content:");
//		List<String> countries = fileContent.stream()
//											.map(fileContent -> fileContent.get)
		
		
		
		
		
//		for (String line : fileContent) {
//			System.out.println(line);
//		}

	}

}
