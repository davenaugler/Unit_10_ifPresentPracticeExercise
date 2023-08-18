// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

//	public List<String> readFiles(String filePaths) throws FileNotFoundException, IOException {
//		List<String> lines = new ArrayList<>();
//		boolean skipHeader = true;
////		int counter = 0;
//		
//		try (BufferedReader fileReader = new BufferedReader(new FileReader(filePaths))) {
//			String line;
//			while ((line = fileReader.readLine()) != null) {
//				// Skip .csv header
//				if(skipHeader) {
//					skipHeader = false;
//					continue;
//				}
//				lines.add(line);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return lines;
//	}

	public void readFiles(List<String> filePaths) throws FileNotFoundException, IOException {
		for (String filePath : filePaths) {
			readSuspectLocationsFromFile(filePath);
		}
	}

//	private void skipHeader() {
//		try(BufferedReader fileReader = new BufferedReader(new FileReader(filePaths))) {
//			String line;
//			while ((line = fileReader.readLine()) != null) {
//	}
//			
//		}
//	}

//	private void readFile(String filePath) throws FileNotFoundException, IOException {

	private List<SuspectLocation> readSuspectLocationsFromFile(String filePath)
			throws FileNotFoundException, IOException {
		List<SuspectLocation> suspectLocations = new ArrayList<>();
		String line;
		try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
			fileReader.readLine(); // This reads the first line (aka header) to the .csv file and ignores it
			while ((line = fileReader.readLine()) != null) {
				String[] values = line.split(",");
				
				// Possible 'if' statement here, in order to allow the following to work. MAYBE
				// NEEDED, MAYBE NOT.
				String name = values[0].trim();
				String country = values[1].trim();
				
				suspectLocations.add(new SuspectLocation(name, country));

//				for (String value : values) {
//					System.out.println(value + " ");
//					System.out.println(value);
//				}
//				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return suspectLocations;

	}
}
