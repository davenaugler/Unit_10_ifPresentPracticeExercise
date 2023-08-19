// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuspectService {

	// 1. Read the 3 files (you can set the filename as a parameter and pass the
	// filename)
	// and returning a list of SuspectLocation objects
	// a. SupsectLocation contains a name and a country
	// 2. Reading the list of suspects, filtering the names to find Carmen Sandiego,
	// and if
	// present print to console "Carmen Sandiego is in...<insert country name here>"

	// Method #1
	// readThreeFiles
	FileService fileService = new FileService();

	// 1. Method for reading all three files
	public List<SuspectLocation> readThreeFiles(List<String> csvFiles) throws FileNotFoundException, IOException {
		List<SuspectLocation> suspectLocation = new ArrayList<>();
//		List<String> filePaths = Arrays.asList(fileName1, fileName2, fileName3);
		fileService.readFiles(csvFiles);

		Map<String, List<SuspectLocation>> suspects = suspectLocation.stream()
				.filter(name -> name.getName().equals("Carmen Sandiego"))
				.collect(Collectors.groupingBy(SuspectLocation::getCountry));
		
		Optional<String> country = suspects.entrySet().stream().map(entry -> entry.getValue().get(0).getCountry()).findFirst();

		System.out.println("Carmen Sandiego is in… " + country);

//		return suspects;
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	

//	public List<String> filterToFindName(List<String> fileNames) throws FileNotFoundException, IOException {
//		readThreeFiles(fileNames);
//		return null;
//
//	}
	
	
	
	
	
	
	
	
	
	
	

//	public List<String> readFiles() {
//		try {
//			return fileService.readFile();
//		} catch (IOException e) {
//			System.out.println("Error in reading file");
//			e.printStackTrace();
//		}
//		return null;
//	}

	// Method #2
	// readListOfSuspects

	// filterTheNamesToFindCarmenSandiego

	// ifPresentPrintToConsole

}
