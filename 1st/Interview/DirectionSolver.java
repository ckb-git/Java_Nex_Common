package Interview;

public class DirectionSolver {
	public static String findFinalDirection(String directions) {
		int north = 0;
		int east = 0;

		for (char direction : directions.toCharArray()) {
			switch (direction) {
			case 'N':
				north++;
				break;
			case 'S':
				north--;
				break;
			case 'E':
				east++;
				break;
			case 'W':
				east--;
				break;
			}
		}

		StringBuilder result = new StringBuilder();

		if (north > 0) {
			for (int i = 0; i < north; i++) {
				result.append('N');
			}
		} else if (north < 0) {
			for (int i = 0; i > north; i--) {
				result.append('S');
			}
		}

		if (east > 0) {
			for (int i = 0; i < east; i++) {
				result.append('E');
			}
		} else if (east < 0) {
			for (int i = 0; i > east; i--) {
				result.append('W');
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String input1 = "NNEWS";
		String input2 = "NEWSNWESNWSNEWSNWESNWS";
		String input3 = "NWSSEWSNWSSNNEEWS";

		String output1 = findFinalDirection(input1);
		String output2 = findFinalDirection(input2);
		String output3 = findFinalDirection(input3);

		System.out.println("Output 1: " + output1); // Output should be "S"
		System.out.println("Output 2: " + output2); // Output should be "WW"
		System.out.println("Output 3: " + output3); // Output should be "SSW"
	}
}
