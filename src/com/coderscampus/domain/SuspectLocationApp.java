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
	}

}
