/*
 * Define the missing method. licenseNum is created as: (100000 * customID) + licenseYear, where customID is a method parameter. 
 * Sample output with inputs 2014 777:
 */
package zyBooks;

//===== Code from file DogLicense.java =====
public class DogLicense {
private int licenseYear;
private int licenseNum;

public void setYear(int yearRegistered) {
   licenseYear = yearRegistered;
}

// FIXME: Write createLicenseNum()

/* Your solution goes here  */
public void createLicenseNum(int customID) {
    licenseNum = (customID * 100000) + licenseYear;
}

public int getLicenseNum() {
   return licenseNum;
}
}
//===== end =====

//===== Code from file CallDogLicense.java =====
import java.util.Scanner;

public class CallDogLicense {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		DogLicense dog1 = new DogLicense();
		int userYear;
		int userId;

		userYear = scnr.nextInt();
		userId = scnr.nextInt();

		dog1.setYear(userYear);
		dog1.createLicenseNum(userId);
		System.out.println("Dog license: " + dog1.getLicenseNum());

	}
}
//===== end =====