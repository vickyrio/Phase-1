package com.lockedme;


public class Mainactivity {

	public static void main(String[] args) {
		
	    
		    //Prompt Welcome screen
			MainMenu.printWelcomeScreen("LockedMe","Ganapathi N");
			// Main Folder creation 
	        FileFeatures.createMainFolderIfNotPresent("File");
			FileOptions.handleWelcomeScreenInput();
		}


	}

