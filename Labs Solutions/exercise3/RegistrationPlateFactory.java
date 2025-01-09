package exercise3;

public class RegistrationPlateFactory {
	private static int count = 0;

	private static String[] regPlates = { "MRB1G", "RU16", "TOYS4US", "HNZ57", "PUT3", "JB007" };

	private RegistrationPlateFactory() {
	}

	public static RegistrationPlate getNextRegistrationPlate() {
		if (count < regPlates.length)
			return new RegistrationPlate(regPlates[count++]);
		else
			return null;
	}
}
