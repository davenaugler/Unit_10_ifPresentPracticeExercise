// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	public List<SuspectLocation> readFromFile(String filename) throws FileNotFoundException, IOException {
		List<SuspectLocation> locations = new ArrayList<>();
		try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
			String line;
			fileReader.readLine(); // Reads first line of CSV and ignores it
			while ((line = fileReader.readLine()) != null) {
				String[] data = line.split(",");
				locations.add(new SuspectLocation(data[0].trim(), data[1].trim()));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return locations;
	}

}
