package Esercizio02;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) throws KmLitriException {

		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Inserisci il numero di km percorsi: ");
			double km = input.nextDouble();

			System.out.print("Inserisci il numero di litri di carburante consumati: ");
			double litri = input.nextDouble();

			double kmPerLitro = kmPerLitro(km, litri);
			System.out.printf("Il numero di km/litro percorsi è %.2f: ", kmPerLitro);
		} catch (ArithmeticException e) {
			System.out
					.println("Impossibile eseguire il calcolo. Inserire un valore diverso da 0 per i litri consumati");
		} catch (KmLitriException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ciao");
		input.close();
	}

	public static double kmPerLitro(double km, double litri) throws KmLitriException {
		if (km < 0 || litri < 0) {
			throw new KmLitriException("Inserire valori positivi");
		}
		if (litri == 0) {
			throw new ArithmeticException();
		}
		return km / litri;
	}
}
