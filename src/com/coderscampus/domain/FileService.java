// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	public void readFiles(List<String> filePaths) throws FileNotFoundException, IOException {
		for (String filePath : filePaths) {
			readSuspectLocationsFromFile(filePath);
		}
	}

	private List<SuspectLocation> readSuspectLocationsFromFile(String filePath)
			throws FileNotFoundException, IOException {
		List<SuspectLocation> suspectLocations = new ArrayList<>();
		String line;
		try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
			fileReader.readLine(); // Reads first line of CSV and ignores it
			while ((line = fileReader.readLine()) != null) {
				String[] values = line.split(",");
				SuspectLocation suspect = new SuspectLocation(values[0], values[1]);
				suspectLocations.add(suspect);

				// Possible 'if' statement here, in order to allow the following to work. MAYBE
				// NEEDED, MAYBE NOT.

				// ----- These 3 lines got replaced by the 2 lines above on line 59 and 60 ---
				// //
//				String name = values[0].trim();
//				String country = values[1].trim();
//				suspectLocations.add(new SuspectLocation(name, country));
				// --------------------------------------------------------- //

//				for (String value : values) {
//					System.out.println(value + " ");
//					System.out.println(value);
//				}
//				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(suspectLocations);
		return suspectLocations;

	}
}
