package kapitel_02;

import java.io.IOException;
import java.util.Scanner;

public class AlderMedTastaturindlaesning
{
	public static void main(String[] arg)
	{
		Scanner tastatur = new Scanner(System.in);  // forbered

		System.out.println("Skriv din alder herunder og tryk retur:");
		int alder;
		alder = tastatur.nextInt();                     // læs et tal fra tastaturet
		tastatur.nextLine();                            // skift til næste linje

		if (alder >= 18) System.out.println("Du er myndig.");
		System.out.println("Du er " + alder + " år.");
	}
}