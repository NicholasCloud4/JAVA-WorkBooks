/*
 * Print person1's kids, call the incNumKids() method, and print again, outputting text as below. End each line with a newline.
Sample output for below program with input 3:
 */

package zyBooks;

//===== Code from file PersonInfo.java =====
public class PersonInfo {
private int numKids;

public void setNumKids(int setPersonsKids) {
   numKids = setPersonsKids;
}

public void incNumKids() {
   numKids = numKids + 1;
}

public int getNumKids() {
   return numKids;
}
}
//===== end =====

//===== Code from file CallPersonInfo.java =====
import java.util.Scanner;

public class CallPersonInfo {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		PersonInfo person1 = new PersonInfo();
		int personsKid;

		personsKid = scnr.nextInt();

		person1.setNumKids(personsKid);

		/* Your solution goes here */
		System.out.println("Kids: " + person1.getNumKids());
		person1.incNumKids();
		System.out.println("New baby, kids now: " + person1.getNumKids());

	}
}
//===== end =====
