package exercise6;

import exercise3.RegistrationPlate;

public class RegistrationPlateFactory {
	private static int count = 0;

	private static String[] regPlates = { "MRB1G", "RU16", "TOYS4US", "HNZ57", "PUT3", "JB007" };

	private RegistrationPlateFactory() {
	}

	public static RegistrationPlate getNextRegistrationPlate() throws Exception {
		if (count < regPlates.length)
			return new RegistrationPlate(regPlates[count++]);

		throw new Exception("No more registration plate numbers!");
	}
}
