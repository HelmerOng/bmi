package bmi;
import java.util.Scanner;
public class bmi {
	public static void main(String[] args) {
		Scanner weight = new Scanner(System.in);
		weight.useLocale(java.util.Locale.ENGLISH);
		System.out.println("Bitte Gewicht eingeben: ");
		float gewicht = weight.nextFloat();
		
		System.out.println("Bitte Körpergröße eingeben: ");
		Scanner height = new Scanner(System.in);
		height.useLocale(java.util.Locale.ENGLISH);
		
		float grösse = height.nextFloat();
		float bmi = 0;
		bmi = gewicht / (grösse * grösse);
		
		System.out.println("Dein Body Mass Index beträgt: " + bmi);
		
		if(bmi > 24.9) {
			System.out.println("Somit bist du übergewichtig.");
		}
		else if(bmi < 18.5) {
			System.out.println("Somit bist du untergewichtig.");
		}
		else {
			System.out.println("Somit bist du normalgewichtig.");
		}
	}
}