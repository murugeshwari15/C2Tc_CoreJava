package projectone;

import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseMain 
{
	public static void main(String[] args) throws SQLException 
	{
		 Scanner in = new Scanner(System.in);
	        int option;
	        boolean exit = false;
	        
	        System.out.println("Employee Management");
	        
	        while (!exit) {
	            System.out.println("Choose which operation to perform : ");
	            System.out.println("1. Insert\n2. Show\n3. Update\n4. Delete\n5. Exit");
	            option = in.nextInt();
	            in.nextLine(); // Consume the newline

	            switch (option) {
	                case 1:
	                    System.out.println("Number of rows affected : " + DatabaseOperation.insert());
	                    break;
	                case 2:
	                    DatabaseOperation.show();
	                    break;
	                case 3:
	                    System.out.println("Number of rows affected : " + DatabaseOperation.update());
	                    break;
	                case 4:
	                    System.out.println("Number of rows affected : " + DatabaseOperation.delete());
	                    break;
	                case 5:
	                    exit = true;
	                    System.out.println("End");
	                    break;
	                default:
	                    System.out.println("Invalid option! Please choose a valid operation.");
	                    break;
	            }

	            if (!exit) {
	                boolean continueFlag = true;
	                while (continueFlag) {
	                    System.out.println("Do you want to continue? (yes/no)");
	                    String continueResponse = in.nextLine();

	                    if (continueResponse.equalsIgnoreCase("no")) {
	                        exit = true;
	                        continueFlag = false;
	                    } else if (continueResponse.equalsIgnoreCase("yes")) {
	                        continueFlag = false;
	                    } else {
	                        System.out.println("Invalid response! Please answer yes or no.");
	                    }
	                }
	            }
	        }

	        System.out.println("Exiting the application.");
	        in.close(); // Close the scanner to avoid resource leaks
	    }
	}


