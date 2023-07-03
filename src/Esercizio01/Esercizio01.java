
package Esercizio01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) throws NumeroInputException, PosizioneInputException {
		int[] arrayRandom = new int[5];
		arrayRandom = riempimentoRandom(arrayRandom);
		stampaArrayRandom(arrayRandom);
		aggiungiNumeriInput(arrayRandom);
	}

	public static int[] riempimentoRandom(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int numRandom = random.nextInt(11);
			array[i] = numRandom;
		}
		return array;
	}

	public static void stampaArrayRandom(int[] array) {
		System.out.println("L'array generato in maniera random è:\n" + Arrays.toString(array));
	}

	public static void aggiungiNumeriInput(int[] array) throws NumeroInputException, PosizioneInputException {

		int numeroInput;
		int numeroInputSostitutivo;
		try (Scanner input = new Scanner(System.in)) {
			do {
				System.out.println("Inserire un numero per aggiornare l'array:");
				numeroInput = Integer.parseInt(input.nextLine());
				numeroInputSostitutivo = numeroInput;
				if (numeroInput >= 0 && numeroInput < 11) {
					try {
						System.out.printf("Inserire la posizione in cui vuoi inserire il numero %d:", numeroInput);
						int posizione = Integer.parseInt(input.nextLine());

						if (posizione < 0 || posizione >= array.length) {
							throw new PosizioneInputException("Posizione non valida");
						} else {
							array[posizione] = numeroInputSostitutivo;
						}
					}

					catch (PosizioneInputException e) {
						System.out.println(e.getMessage());
					}
				} else {
					throw new NumeroInputException("Hai inserito un numero non compreso tra 0 e 10");
				}

			} while (numeroInput != 0);

			input.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("L'array aggiornato è:\n" + Arrays.toString(array));
	}
}
