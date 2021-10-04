package com.lockedme;

public class MainMenu {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("**************************************************\n"
				+ "*** WElCOME TO %s.com. \n" + "*** APPLICATION DEVELOPED BY %s.\n"
				+ "**************************************************\n", appName, developerName);
		String appFunction = "GENERIC FEATURES OF THE APPLICATION:-\n"
				+"\n"
				+ "--> LIST ALL FILES FROM FROM THE FILE FOLDER\n"
				+ "--> SEARCH , DELETE AND INSERT FILES FROM THE FOLDER \n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n****** SELECT  ANY OPTION FROM BELOW AND PRESS ENTER ******\n\n"
				+ "1) Retrieve all files inside \"File\" folder\n" + "2) Display menu for File Featuers\n"
				+ "3) Exit Application\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"File\" folder\n" + "2) Delete a file from \"File\" folder\n"
				+ "3) Search for a file from \"File\" folder\n" + "4) Go to Previous Menu\n" + "5) Exit Application\n";

		System.out.println(fileMenu);
	}

}
