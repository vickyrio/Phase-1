package com.lockedme;

import java.util.List;
import java.util.Scanner;

public class FileOptions {
	public static void handleWelcomeScreenInput() {
		boolean start = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MainMenu.displayMenu();
				int a = sc.nextInt();

				switch (a) {
				case 1:
					FileFeatures.displayAllFiles("Files");
					break;
				case 2:
					FileOptions.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Application exits successfully.");
					start = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("*******PLEASE SELECT A VALID OPTION*********");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (start == true);
	}
	
	public static void handleFileMenuOptions() {
		boolean start = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MainMenu.displayFileMenuOptions();
				FileFeatures.createMainFolderIfNotPresent("Files");
				
				int a = sc.nextInt();
				switch (a) {
				case 1:
					// ADD FILE
					System.out.println("***** ENTER FILE NAME WITHOUT ANY SPACES*****");
					System.out.println("Enter the name of the file to be added to the \"Files \" folder");
					String fileToAdd = sc.next();
					
					FileFeatures.createFile(fileToAdd, sc);
					
					break;
				case 2:
					// DELETE FILE
					System.out.println("Enter the name of the file to be deleted from \"Files\" folder");
					String fileToDelete = sc.next();
					
					FileFeatures.createMainFolderIfNotPresent("Files");
					List<String> filesToDelete = FileFeatures.displayFileLocations(fileToDelete, "Files");
					
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
				
					int delete = sc.nextInt();
					
					if (delete != 0) {
						FileFeatures.deleteFileRecursively(filesToDelete.get(delete - 1));
					} else 
					{	//  delete all files 
						for (String path : filesToDelete) {
							FileFeatures.deleteFileRecursively(path);
						}
					}
					

					break;
				case 3:
					// SEARCH FILE
					System.out.println("Enter the name of the file to be searched from \"Files\" folder");
					String fileName = sc.next();
					
					FileFeatures.createMainFolderIfNotPresent("Files");
					FileFeatures.displayFileLocations(fileName, "Files");

					
					break;
				case 4:
					// Go to Previous menu
					return;
				case 5:
					// Exit
					System.out.println("Application exits successfully.");
					start = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
		} while (start == true);
	}

}
